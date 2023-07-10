package mysql.ex07_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.ex07_bbs.entity.User;

public class UserDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public UserDao() {
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
	
	public User getUser(String uid) {
		User u = null;
		Connection conn = myConnection();
		String sql = "select * from users where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next()) {
				u = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							 LocalDate.parse(rs.getString(5)), rs.getInt(6));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public List<User> getUserList(int num, int offset) {
		List<User> list = new ArrayList<User>();
		Connection conn = myConnection();
		String sql = "select * from users where isDeleted=0 order by regDate desc limit ? offset ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, offset);
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next()) {
				User u = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							 LocalDate.parse(rs.getString(5)), rs.getInt(6));
				list.add(u);
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertUser(User u) {
		Connection conn = myConnection();
		String sql = "insert into users values (?, ?, ?, ?, default, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUid());
			pstmt.setString(2, u.getPassword());
			pstmt.setString(3, u.getUname());
			pstmt.setString(4, u.getEmail());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User u) {
		Connection conn = myConnection();
		String sql = "update users set password=?, uname=?, email=?, regDate=? where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getPassword());
			pstmt.setString(2, u.getUname());
			pstmt.setString(3, u.getEmail());
			pstmt.setString(4, u.getRegDate().toString());
			pstmt.setString(5, u.getUid());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(String uid) {
		Connection conn = myConnection();
		String sql = "update users set isDeleted=1 where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
