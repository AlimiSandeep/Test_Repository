package com.cg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		System.out.println("Connected");
		String sql="select count(emp_id) as TOTAL ,sum(emp_sal) as TSAL,round(avg(nvl(emp_sal,0)),2) as TAVG from employee";
		PreparedStatement st=conn.prepareStatement(sql);
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate ldt=null;
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println("------------------------------------");
			System.out.println("No of employees : "+rs.getInt("TOTAL"));
			System.out.println("Total salary : "+rs.getDouble("TSAL"));
			System.out.println("Average salary : "+rs.getDouble("TAVG"));
			

		}
		conn.close();
	}
}
