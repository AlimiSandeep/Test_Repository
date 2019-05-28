package com.cg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		System.out.println("Connected");
		String sql="select * from employee where emp_sal=(select max(emp_sal) from employee)"; 
		PreparedStatement st=conn.prepareStatement(sql);
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate ldt=null;
		
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println("------------------------------------");
			System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+
			rs.getDouble("emp_sal")+" "+rs.getString("emp_dept"));
			ldt=rs.getDate("doj").toLocalDate();
			System.out.println(ldt.format(dtf2));

		}
		conn.close();
	}
}
