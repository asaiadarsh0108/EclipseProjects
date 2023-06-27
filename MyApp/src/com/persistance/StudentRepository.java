package com.persistance;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.accountmodel.Student;

import Exceptions.ResourceNotFoundException;

public class StudentRepository implements BaseRepository<Student,Integer>{

	@Override
	public List<Student> getAll(List<Student> student) {
		return student;
	}

	@Override
	public List<Student> getOne(List<Student> student, int id) throws ResourceNotFoundException{
		for(Student s:student) {
			if(s.getId()==id) {
				return (List<Student>) s;
			}
		}
		throw new ResourceNotFoundException("Id not available");
	}

	
	@Override
	public List<Student> delete(List<Student> list, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> edit(List<Student> list, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getOneByStream(List<Student> list, int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		list=list.stream().filter(s->s.getId()==id).collect(Collectors.toList());
		if(list.size()==0) {
			throw new ResourceNotFoundException("Id not available");
		}
		return list;
	}

	@Override
	public List<Student> sort(List<Student> student, String direction) {
		Collections.sort(student);
		return student;
	}
	
	public List<Student> sortUsingStreams(List<Student> student){
		student=student.stream().sorted((a,b)->b.getMarks()-a.getMarks()).collect(Collectors.toList());
		return student;
	}

}
