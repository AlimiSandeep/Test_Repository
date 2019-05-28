package com.cg.scrollable;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "cmr");
		String sql="select emp_id,emp_name,emp_sal,emp_dept,doj from employee";
		PreparedStatement st=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=st.executeQuery();
		rs.moveToInsertRow();
		rs.updateInt("emp_id", 1014);
		rs.updateString("emp_name", "jerry");
		rs.updateDouble("emp_sal",45000);
		rs.updateString("emp_dept", "pr");
		
		LocalDate ldt=LocalDate.now();
		Date sqldt=Date.valueOf(ldt);
		rs.updateDate("doj",sqldt);
		rs.insertRow();
		conn.close();
		System.out.println("Row inserted");
}
}