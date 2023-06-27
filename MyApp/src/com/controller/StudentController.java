package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.model.accountmodel.Student;
import com.persistance.StudentRepository;
import com.service.StudentService;

import Exceptions.ResourceNotFoundException;

public class StudentController {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sai", "Hyderabad", 200);
		Student s2 = new Student(2, "Adarsh", "Banglore", 210);
		Student s3 = new Student(3, "Ravi", "Nandyal", 190);
		
		List<Student> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		StudentService service = new StudentService();
		
		List<Student> li=service.getAll(student);
		try {
			li = service.getOneByStream(student,2);
			System.out.println(li);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		li=service.sortUsingStreams(student);
		System.out.println(li);
	}
}
