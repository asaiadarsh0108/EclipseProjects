package com.StudentApp.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.StudentApp.model.Student;
import com.mysql.cj.protocol.Resultset;

public interface StudentRepository extends BaseRepository {
	public default int insert(Student student, Connection con) {
		int status = 0;
		String query = "insert into student(name,department,rollno,marks) values (?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getDepartment());
			pstmt.setInt(3, student.getRollNo());
			pstmt.setInt(4, student.getMarks());
			status = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public default List<Student> getAll(Connection con){
		List<Student> list= new ArrayList<>();
		String query = "select * from student";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rst = pstmt.executeQuery();
			while(rst.next()) {
				int id = rst.getInt("id");
				String name = rst.getString("name");
				String department = rst.getString("department");
				int rollno = rst.getInt("rollno");
				int marks = rst.getInt("marks");
				Student s= new Student();
				s.setId(id);
				s.setName(name);
				s.setDepartment(department);
				s.setRollNo(rollno);
				s.setMarks(marks);
				list.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public default boolean validateById(int id,Connection con) {
		String query = "select * from student where id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			return rst.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public default int update(Student s,Connection con) {
		int status =0;
		String query= "update student SET name=?,department=?,rollno=?,marks=? where id=?";
		try {
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1, s.getName());
			pstmt.setString(2, s.getDepartment());
			pstmt.setInt(3, s.getRollNo());
			pstmt.setInt(4, s.getMarks());
			pstmt.setInt(5, s.getId());
			status=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public default int delete(int id,Connection con) {
		int status=0;
		String query="delete from student where id=?";
		try {
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setInt(1, id);
			status=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
}
