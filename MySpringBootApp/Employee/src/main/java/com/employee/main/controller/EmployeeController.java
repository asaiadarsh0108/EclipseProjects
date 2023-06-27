package com.employee.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.main.model.Employee;
import com.employee.main.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		List<Employee> list=employeeService.getAll();
		return list;
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		Employee emp = employeeService.getById(id);
		if(emp==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id");
		}
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeService.add(emp);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable int id,@RequestBody Employee emp) {
		Employee e= employeeService.update(id, emp);
		if(e==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Employee Updated successfully");
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
		Employee e=employeeService.deleteById(id);
		if(e== null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Employee deleted succesfully");
	}
}
