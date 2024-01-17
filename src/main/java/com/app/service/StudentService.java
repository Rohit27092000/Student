package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	public Student getById(int id);
	public String addStudent(Student theStudent);
	public Student updateStudent(Student theStudent);
	public String deleteStudent(int studentId); 
}
