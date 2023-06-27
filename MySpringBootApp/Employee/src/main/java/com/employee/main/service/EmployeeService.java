package com.employee.main.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.employee.main.model.Employee;
@Service
public class EmployeeService {
	private Map<Integer,Employee> employees = new HashMap<>();
	private int index=2;
	EmployeeService(){
	Employee emp1 = new Employee(1, "Sai", "9393939393", 38072L);
	Employee emp2 = new Employee(2, "Adarsh", "8989898989", 48092L);
	employees.put(1,emp1);
	employees.put(2, emp2);
	}
	public List<Employee> getAll() {
		return new ArrayList<>(employees.values());
	}
	public Employee getById(int id) {
		return employees.get(id);
	}
	public Employee add(Employee emp) {
		index+=1;
		emp.setId(index);
		employees.put(index, emp);
		return emp;
	}
	public Employee update(int id, Employee emp) {
		Employee oldEmployee=employees.get(id);
		if(oldEmployee==null) {
			return null;
		}
		emp.setId(id);
		return employees.put(id,emp);
	}
	public Employee deleteById(int id) {
		Employee employee = employees.get(id);
		if(employee==null) {
			return null;
		}
		return employees.remove(id);
	}	
}
