package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;


public interface Studentdao {
	// fro insert a data
	int insert(Student student);
	
	int change(Student student);
	
	int delete(int studentid);

	Student getStudent(int studentid);
	
	List<Student> getSudent();
}
