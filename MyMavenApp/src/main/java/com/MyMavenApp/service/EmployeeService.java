package com.MyMavenApp.service;

import java.sql.Connection;
import java.util.List;

import com.MyMavenApp.model.Employee;
import com.MyMavenApp.persistance.EmployeeRepository;

public class EmployeeService implements EmployeeRepository{

	public int save(Employee employee) {
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		int status =save(employee,con);
		dbClose(con);
		return status;
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		List<Employee> emp = getAll(con);
		dbClose(con);
		return emp;
	}

	public void validateId(int id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		boolean isPresent;
		isPresent = validateId(id,con);
		if(isPresent==false) {
			throw new ResourceNotFoundException("Invalid id");
		}
		dbClose(con);
	}

	public int deleteId(int id) {
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		int status = deleteById(id,con);
		dbClose(con);
		return status;
	}

	public int updateById(Employee employee) {
		// TODO Auto-generated method stub
		Connection con =dbConnect();
		int status = updateById(employee,con);
		dbClose(con);
		return status;
	}

	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		Employee e = getById(id,con);
		dbClose(con);
		return e;
		
		
	}

}
