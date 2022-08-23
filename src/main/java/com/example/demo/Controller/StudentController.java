package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

public class StudentController {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"Arjun"));
		list.add(new Student(2,"karthik"));
		list.add(new Student(3,"rammez"));
		list.add(new Student(4,"nagu"));
		list.add(new Student(5,"mallu"));
		list.add(new Student(6,"anand"));
		list.add(new Student(7,"farooq"));
		list.add(new Student(8,"kumar"));
		list.add(new Student(9,"bablu"));
		list.add(new Student(10,"hari"));
		
		for(Student s:list)
			System.out.println(s.toString());
		
		
		
	}

}
