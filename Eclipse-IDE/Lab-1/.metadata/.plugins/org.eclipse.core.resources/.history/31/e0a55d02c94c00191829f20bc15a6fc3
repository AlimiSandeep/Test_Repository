package com.cg.scrollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ScrollDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		String sql="select * from employee";
		PreparedStatement st=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery();
		System.out.println("Displaying the first row");
		rs.first();
		display(rs);
		
		System.out.println("Displaying the last row");
		rs.last();
		display(rs);
		
		System.out.println("Displaying the third row");
		rs.absolute(3);
		display(rs);
		
		System.out.println("Count no of rows ");
		rs.last();
		int row=rs.getRow();
		System.out.println(row);
		
}
	public static void display(ResultSet rs) throws SQLException
	{
		System.out.println(rs.getInt("emp_id"));
		System.out.println(rs.getString("emp_name"));
		System.out.println(rs.getDouble("emp_sal"));
		System.out.println(rs.getString("emp_dept"));
	}
}
