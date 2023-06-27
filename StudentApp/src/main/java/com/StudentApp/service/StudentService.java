package com.StudentApp.service;

import java.sql.Connection;
import java.util.List;

import com.StudentApp.model.Student;
import com.StudentApp.persistance.StudentRepository;

public class StudentService implements StudentRepository{

	public int insert(Student student) {
		// TODO Auto-generated method stub
		Connection con= dbConnect();
		int status = insert(student,con);
		return status;
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		Connection con = dbConnect();
		List<Student> s= getAll(con); 
		return s;
	}

	public void validateId(int id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		boolean status;
		Connection con = dbConnect();
		status=validateById(id,con);
		if(status==false) {
			throw new ResourceNotFoundException("invalid id");
		}
	}

	public int update(Student s) {
		int status;
		Connection con = dbConnect();
		status=update(s,con);
		return status;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		int status=0;
		Connection con = dbConnect();
		status=delete(id,con);
		return status;
	}

}
