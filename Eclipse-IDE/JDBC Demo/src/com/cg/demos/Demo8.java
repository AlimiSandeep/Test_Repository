package com.cg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo8 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		System.out.println("Connected");
		String sql="update employee set emp_sal=? where emp_id=?";
		PreparedStatement st=conn.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter eid:");
		int eid=scan.nextInt();
		System.out.println("Enter salary: ");
		double sal=scan.nextDouble();
		
		st.setDouble(1,sal);
		st.setInt(2,eid);
		int res=st.executeUpdate();
		System.out.println(res+" rows updated");
}
}