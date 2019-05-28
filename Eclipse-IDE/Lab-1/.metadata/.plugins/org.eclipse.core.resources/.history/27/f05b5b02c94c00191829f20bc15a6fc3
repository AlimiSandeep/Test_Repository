package com.cg.demos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo7 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-M-yyyy");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		
		conn.setAutoCommit(false);
		
		System.out.println("Connected");
		String sql="insert into employee values(?,?,?,?,?)";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setInt(1, 1015);
		st.setString(2, "rahul");
		st.setDouble(3, 37000);
		st.setString(4, "pr");
		
		String str="12-05-2011";
		LocalDate ldt=LocalDate.parse(str,df);
		Date sqldt=Date.valueOf(ldt);
		st.setDate(5, sqldt);
		
		int res=st.executeUpdate();
		
		conn.commit();
		
		System.out.println(res+"  rows affected");
		
		conn.close();
}
}