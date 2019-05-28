package com.cg.scrollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateRow {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		String sql="select emp_id,emp_name,emp_sal,emp_dept,doj from employee";
		PreparedStatement st=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=st.executeQuery();
		rs.absolute(4);
		rs.updateDouble("emp_sal", 20000.0);
		rs.updateRow();
		
		
		conn.close();
		System.out.println("Row updated");
}
}
