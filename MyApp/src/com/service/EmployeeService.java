package com.service;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
public class EmployeeService {
	public List<Employee> getAllEmployees(){
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		
		List<Employee> list = new ArrayList<>();
		
		e1.setId(1);
		e1.setName("Sai");
		e1.setCity("Nandyal");
		e1.setDepartment("IT");
		e1.setSalary(120000);
		
		e2.setId(2);
		e2.setName("Sai");
		e2.setCity("Nandyal");
		e2.setDepartment("IT");
		e2.setSalary(120000);
		
		e3.setId(1);
		e3.setName("Sai");
		e3.setCity("Nandyal");
		e3.setDepartment("IT");
		e3.setSalary(120000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		return list;
	}
	

}
