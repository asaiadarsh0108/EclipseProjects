package com.persistance;

import java.util.List;

import com.model.accountmodel.Student;

import Exceptions.ResourceNotFoundException;

public interface BaseRepository<T,ID> {
	public default void dbConnect() { 
		System.out.println("DbConnect");
	}
	public default void dbClose() {
		System.out.println("Dbclose");
	}
	public List<T> getAll(List<T> list);
	public List<T> getOne(List<T> list,int id) throws ResourceNotFoundException;
	public List<T> getOneByStream(List<T> list,int id) throws ResourceNotFoundException;
	public List<T> delete(List<T> list, int id);
	public List<T> edit(List<T> list,int id);
	public List<T> sort(List<T> list,String direction);
	
}
