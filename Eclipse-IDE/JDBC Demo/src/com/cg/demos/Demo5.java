package com.cg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		System.out.println("Connected");
		String sql="select emp_dept,count(emp_id) as TOTAL,max(emp_sal) as MAX,min(emp_sal) as MIN from employee group by emp_dept";
		PreparedStatement st=conn.prepareStatement(sql);

		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println("------------------------------------");
			System.out.println("Dept Name :"+rs.getString("emp_dept"));
			System.out.println("No of employees : "+rs.getInt("TOTAL"));
			System.out.println("Max salary : "+rs.getDouble("MAX"));
			System.out.println("Min salary : "+rs.getDouble("MIN"));
			

		}
		conn.close();
	}
}
