package com.cg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RsmdDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		System.out.println("Connected");
		String sql="select * from employee";
		PreparedStatement st=conn.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("No of columns :"+rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++){
			
			System.out.println("Column Name: "+rsmd.getColumnName(i));
			System.out.println("Column Type: "+rsmd.getColumnTypeName(i));
			System.out.println("Column Precision: "+rsmd.getPrecision(i));
			System.out.println("Column Scale: "+rsmd.getScale(i));
			System.out.println("------------------------------------------");


		}
			
		
		conn.close();
}
}