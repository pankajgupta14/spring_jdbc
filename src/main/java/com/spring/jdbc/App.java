package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Studentdao;
import com.spring.jdbc.dao.Studentdaoimp;
import com.spring.jdbc.entity.Student;
 
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "today we will learn jdbc spring" );
         //getting a object of jdbc template
       ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       Studentdao b = con.getBean("studentdao",Studentdao.class);
       
 /*      //for inserting a data
       Student s= new Student();
       s.setId(3);
       s.setName("deepak");
       s.setCity("prayagraj");
       int r = b.insert(s);
       System.out.println("student details is added"+r);*/
       
	/*
	 * // for delete int r = b.delete(2);
	 * System.out.println("account is a deleted"+r );
	 */
       
       
	/*
	 * //for get a single data Student student = b.getStudent(3);
	 * System.out.println(student);
	 */
       
      // for get multiple value
       List<Student> student = b.getSudent();
       for(Student s: student)
       {
    	   System.out.println(s);
       }
    }
}
