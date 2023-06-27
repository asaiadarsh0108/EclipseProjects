package com.controller;

import java.util.List;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employee = employeeService.getAllEmployees();
		
		for(Employee e:employee) {
			System.out.println(e.getId()+"----"+e.getName());
		}
	}
}
