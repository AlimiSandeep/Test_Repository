package com.cg.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CricketTask implements Runnable{

	@Override
	public void run() {
		Connection conn = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@172.16.26.3:1521:xe";
			conn = DriverManager.getConnection(url,"system","cmr");
			String sql = "select * from cricket where cname=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, "india");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("cname"));
				System.out.println(rs.getInt("runs"));
				System.out.println(rs.getInt("wkts"));
				System.out.println("-------------------------------");
			}
		} catch (ClassNotFoundException |SQLException e) {
			System.out.println(e.getMessage());
			
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	

}
