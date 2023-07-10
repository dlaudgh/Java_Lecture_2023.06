package mysql.ex07_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.ex07_bbs.entity.Board;
import mysql.ex07_bbs.entity.Reply;

public class ReplyDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public ReplyDao() {
		try {
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/ex07_bbs/mysql.properties");
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Reply getReply(int rid) {
		Reply r = null;
		Connection conn = myConnection();
		String sql = "select * from reply where rid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				r = new Reply(rs.getInt(1), rs.getString(2),
							  LocalDateTime.parse(rs.getString(3).replace(" ", "T")), 
							  rs.getString(4), rs.getInt(5));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public List<Reply> getReplyList() {
		List<Reply> list = new ArrayList<Reply>();
		Connection conn = myConnection();
		String sql = "select * from reply order by bid desc, rid desc";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Reply r = new Reply(rs.getInt(1), rs.getString(2),
								    LocalDateTime.parse(rs.getString(3).replace(" ", "T")), 
								    rs.getString(4), rs.getInt(5));
				list.add(r);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertReply(Reply r) {
		Connection conn = myConnection();
		String sql = "insert into reply values (default, ?, default, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getComment());
			pstmt.setString(2, r.getUid());
			pstmt.setInt(3, r.getBid());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateReply(Reply r) {
		Connection conn = myConnection();
		String sql = "update reply set comment=?, regTime=NOW() where rid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, r.getComment());
			pstmt.setInt(2, r.getRid());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteReply(int rid) {
		Connection conn = myConnection();
		String sql = "delete from reply where rid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
