package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex03_UpdateParameter {

	public static void main(String[] args) {
		update(2338, "성남", 900000);
	}

	static void update(int id, String city, int population) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world", "ysuser", "yspass");
			String sql = "Update city set name=?, population=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city);
			pstmt.setInt(2, population);
			pstmt.setInt(3, id);
			
			// 반환값이 없는 Query
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}