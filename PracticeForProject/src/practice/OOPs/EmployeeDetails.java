package practice.OOPs;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		int id;
		String name;
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Count of Employees:");
		int n= sc.nextInt();
		Employee1[] employees= new Employee1[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the details of Employee"+(i+1));
			System.out.print("Enter the id:");
			id=sc.nextInt();
			System.out.print("Enter the name:");
			name=sc.next();
			System.out.print("Enter the Salary:");
			salary=sc.nextDouble();
			employees[i]= new Employee1(id,name,salary);
//			employees[i]= new Employee1();//Constructor Overloading
		}
		for(int i=0;i<n;i++) {
			System.out.println("Employee"+(i+1)+":");
			System.out.println("Id:"+employees[i].getId());
			System.out.println("Name:"+employees[i].getName());
			System.out.println("Salary:"+employees[i].getSalary());
		}
		
	}
}

class Employee1{
	private int id;
	private String name;
	private double salary;
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
		//Constructor Overloading
		this.id=21;
		this.name="sai";
		this.salary=23450;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
}

