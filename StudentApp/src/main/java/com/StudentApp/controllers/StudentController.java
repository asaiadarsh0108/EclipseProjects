package com.StudentApp.controllers;

import java.util.List;
import java.util.Scanner;

import com.StudentApp.model.Student;
import com.StudentApp.service.ResourceNotFoundException;
import com.StudentApp.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.dbConnect();
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			System.out.println("-------Student operations------");
			System.out.println("1.Insert student");
			System.out.println("2.Get all students");
			System.out.println("3.update student");
			System.out.println("4.Delete student");
			System.out.println("0:Exit");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting bye...!");
				break;
			}
			switch (input) {
			case 1:
				System.out.println("Inserting student");
				System.out.println("Enter student name:");
				student.setName(sc.next());
				System.out.println("Enter department:");
				student.setDepartment(sc.next());
				System.out.println("enter the rollno:");
				student.setRollNo(sc.nextInt());
				System.out.println("Enter the marks of student:");
				student.setMarks(sc.nextInt());
				int status = service.insert(student);
				System.out.println(status==1?"Student inserted":"Error in inserting student");
				break;
			case 2:
				List<Student> list = service.getAll();
				list.stream().forEach(s->System.out.println(s));
				break;
			case 3:
				System.out.println("Enter the student id to update");
				int id = sc.nextInt();
				student.setId(id);
				try {
					service.validateId(id);
					System.out.println("-----Enter new values-----");
					System.out.println("Enter the student name:");
					student.setName(sc.next());
					System.out.println("Enter the departement:");
					student.setDepartment(sc.next());
					System.out.println("Enter the rollNo:");
					student.setRollNo(sc.nextInt());
					System.out.println("Enter the marks:");
					student.setMarks(sc.nextInt());
					status=service.update(student);
					System.out.println(status==1?"updated successfully":"error in updating");
				} catch (ResourceNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("enter the student id to delete:");
				id=sc.nextInt();
				try {
					service.validateId(id);
					status=service.delete(id);
					System.out.println(status==1?"Student deleted successfully":"error in deleting");
				} catch (ResourceNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}
	}
}
