package com.MyMavenApp.controller;

import java.util.List;
import java.util.Scanner;

import com.MyMavenApp.model.Employee;
import com.MyMavenApp.service.EmployeeService;
import com.MyMavenApp.service.ResourceNotFoundException;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		service.dbConnect();
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		while(true){
			System.out.println("====Employee operations====");
			System.out.println("1. Insert Employee");
			System.out.println("2. Display all Employees");
			System.out.println("3. Delete Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Get Employee by id");
			System.out.println("0. Exit");
			int input = sc.nextInt();
			if(input==0) {
				System.out.println("Exiting bye...!");
				break;
			}
			switch (input) {
			case 1:
				System.out.println("Enter employee Name: ");
				employee.setName(sc.next());
				System.out.println("Enter city:");
				employee.setCity(sc.next());
				System.out.println("Enter the salary:");
				employee.setSalary(sc.nextDouble());
				int status =service.save(employee);
				System.out.println(status==1?"Employee Saved":"Error in saving employee");
				break;
			case 2:
				List<Employee> list = service.getAll();
				list.stream().forEach(e-> System.out.println(e));
				
				break;
			case 3:
				System.out.println("Enter the id of the employee which you want to delete");
				int id = sc.nextInt();
				try {
					service.validateId(id);
					status = service.deleteId(id);
					System.out.println(status==1?"Employee Deleted":"Error in deleting employee");
					
				} catch (ResourceNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter the id to update the employee");
				id = sc.nextInt();
				employee.setId(id);
				try {
					service.validateId(id);
					System.out.println("----Enter the new values----");
					System.out.println("Enter the Employee name");
					employee.setName(sc.next());
					System.out.println("Enter the city");
					employee.setCity(sc.next());
					System.out.println("Enter the salary");
					employee.setSalary(sc.nextDouble());
					status=service.updateById(employee);
					System.out.println(status==1?"Employee Updated sucessfully":"Error in updating employee");
				} catch (ResourceNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
				
			case 5:
				System.out.println("Enter the employee id whom you are looking for");
				id = sc.nextInt();
				try {
					service.validateId(id);
					Employee e = service.getById(id);
					System.out.println(e);
					
				} catch (ResourceNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}
				
				break;
			default:
				System.out.println("Invalid input, Try Again...!");
				break;
			}
		}
	}
}
