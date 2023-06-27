package com.MyMavenApp.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.MyMavenApp.model.Employee;

public interface EmployeeRepository extends BaseRepository{
	public default int save(Employee employee, Connection con) {
		int status=0;
		String query= "insert into employee(name,city,salary) values (?,?,?)";
		try {
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1, employee.getName());
			pstmt.setString(2, employee.getCity());
			pstmt.setDouble(3, employee.getSalary());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public default List<Employee> getAll(Connection con){
		String query = "select * from employee";
		List<Employee>emp = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rst= pstmt.executeQuery();
			while(rst.next()) {
				int id = rst.getInt("id");
				String name = rst.getString("name");
				String city = rst.getString("city");
				double salary= rst.getDouble("salary");
				
				Employee e = new Employee();
				e.setId(id);
				e.setName(name);
				e.setCity(city);
				e.setSalary(salary);
				emp.add(e);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return emp;
		
	}
	
	public default boolean validateId(int id,Connection con) {
		String query = "select * from employee where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			return rst.next();
		} catch (SQLException e) {
			return false;
		}
	}
	public default int deleteById(int id,Connection con) {
		int status =0;
		String query= "delete from employee where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			status =pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public default int updateById(Employee e,Connection con) {
		int status=0;
		String query="update employee SET name=?,city=?,salary=? where id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, e.getName());
			pstmt.setString(2, e.getCity());
			pstmt.setDouble(3, e.getSalary());
			pstmt.setInt(4, e.getId());
			status= pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return status;
	}
	public default Employee getById(int id,Connection con) {
		Employee emp = new Employee();
		String query = "select * from employee where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			//id=rst.getInt("id");
			if (rst.next()) {
				String name = rst.getString("name");
				String city = rst.getString("city");
				double salary = rst.getDouble("salary");
				Employee e = new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setCity(city);
				emp.setSalary(salary);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		
	}
}
