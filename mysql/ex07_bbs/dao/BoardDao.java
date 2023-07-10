package mysql.ex07_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.ex07_bbs.entity.Board;

public class BoardDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public BoardDao() {
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
	
	public Board getBoard(int bid) {
		Board b = null;
		Connection conn = myConnection();
		String sql = "select * from board where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							  LocalDateTime.parse(rs.getString(5).replace(" ", "T")), 
							  rs.getInt(6), rs.getInt(7));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public List<Board> getBoardList(String field, String query, int num, int offset) {
		List<Board> list = new ArrayList<Board>();
		Connection conn = myConnection();
		String sql = "select * from board where " + field + " like ? order by bid desc limit ? offset ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+query+"%");
			pstmt.setInt(2, num);
			pstmt.setInt(3, offset);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board b = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
									LocalDateTime.parse(rs.getString(5).replace(" ", "T")), 
									rs.getInt(6), rs.getInt(7));
				list.add(b);
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertBoard(Board b) {
		Connection conn = myConnection();
		String sql = "insert into board values (default, ?, ?, ?, default, default, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getUid());
			
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateBoard(Board b) {
		Connection conn = myConnection();
		String sql = "update board set title=?, content=?, modTime=NOW() where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getBid());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBoard(int bid) {
		Connection conn = myConnection();
		String sql = "delete from board where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void increaseViewCount(int bid) {
		Connection conn = myConnection();
		String sql = "update board set viewCount=viewCount+1 where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void increaseReplyCount(int bid) {
		Connection conn = myConnection();
		String sql = "update board set replyCount=replyCount+1 where bid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
