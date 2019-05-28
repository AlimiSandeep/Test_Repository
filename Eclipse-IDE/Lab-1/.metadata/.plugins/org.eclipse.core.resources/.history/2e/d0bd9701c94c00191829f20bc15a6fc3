package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.cg.exceptions.IDExceptions;
import com.cg.vo.Emp;

public class JdbcDaoImpl implements IEmpDao{
	public static ResourceBundle rb = DaoFactory.rb;
	public static final String DRIVER;
	public static final String URL;
	public static final String UNAME;
	public static final String PWD;
	
	JdbcDaoImpl(){
		
	}
	static{
		DRIVER = rb.getString("driver");
		URL = rb.getString("url");
		UNAME = rb.getString("uname");
		PWD = rb.getString("pwd");
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public int addEmployee(Emp emp) throws IDExceptions {
		int res =0;
		try(Connection conn = DriverManager.getConnection(URL, UNAME, PWD)){
			String sql ="insert into employee values(?,?,?,?,sysdate)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, emp.getEid());
			st.setString(2, emp.getEname());
			st.setDouble(3, emp.getSal());
			st.setString(4, emp.getDept());
			res = st.executeUpdate();
			
		}
		catch(SQLException ex) {
			//System.out.println(ex.getMessage());
			if(ex.getMessage().contains("unique constraint"))
				throw new IDExceptions("ID already exists", ex);
		}
		return res;
	}
	@Override
	public Emp viewEmployee(int eid) throws IDExceptions {
		Emp emp = null;
		try(Connection conn = DriverManager.getConnection(URL, UNAME, PWD)){
			String sql = "SELECT * FROM employee WHERE emp_id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, eid);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				emp = new Emp(rs.getInt("emp_id"),rs.getString("emp_name"),
						rs.getDouble("emp_sal"),rs.getString("emp_dept"));
			}
			
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(emp == null) 
			throw new IDExceptions("employee not found");
		return emp;
		
		
	}
	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<>();
		Emp emp = null;
		try(Connection conn = DriverManager.getConnection(URL, UNAME, PWD)){
			String sql = "SELECT * FROM employee";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				emp = new Emp(rs.getInt("emp_id"),rs.getString("emp_name"),
						rs.getDouble("emp_sal"),rs.getString("emp_dept"));
				lst.add(emp);
			}
			
			}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return lst;
	}
	@Override
	public int removeEmployee(int eid) throws IDExceptions {
		int res = 0;
		try(Connection conn = DriverManager.getConnection(URL, UNAME, PWD)){
			String sql = "delete from employee where emp_id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, eid);
			res = st.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println("employee id not found");
		}
		return res;
	}
	@Override
	public int editSalary(int eid, double sal) throws IDExceptions {
		int res=0;
		try(Connection conn = DriverManager.getConnection(URL, UNAME, PWD)){
			String sql = "update employee set emp_sal = ? where emp_id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setDouble(1,sal);
			st.setInt(2, eid);
			res = st.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println("employee id not found");
		}
		return res;
	}
}
