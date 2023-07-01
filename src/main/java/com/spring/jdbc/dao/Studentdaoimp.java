package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class Studentdaoimp implements Studentdao {

	public static JdbcTemplate jdbctemp;
	
	public int insert(Student student) {
		// for insert a data
		 String q="insert into student (id , name , city) values(?,?,?)";
		 int r = this.jdbctemp.update(q,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		//  for update
		String q="update student set name=? , city=? where id=?";
		int r=this.jdbctemp.update(q,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int studentid) {
		//  delet opreation
		String q= "delete from student where id=?";
		int r=this.jdbctemp.update(q,studentid);
		return r;
	}
	
	
	public Student getStudent(int studentid) {
		//  to get single object using rowmapper
		String q="select * from student where id=?";
		RowMapper<Student> rowMapper= new Rowmapperimp();
 		Student student=this.jdbctemp.queryForObject(q,rowMapper , 3);
		return student;
	}
	
	
	public List<Student> getSudent() {
		//  for multipe data view
		String q= "select * from student";
		 List<Student> student = this.jdbctemp.query(q, new Rowmapperimp());
		
		return student;
	}
	
	 
	
	
	
	public static JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public static void setJdbctemp(JdbcTemplate jdbctemp) {
		Studentdaoimp.jdbctemp = jdbctemp;
	}
	
	 
	

	
}
