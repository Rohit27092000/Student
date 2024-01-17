package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent()
	{
		List<Student> student = studentService.getAllStudent();
		return student;
	}
	
	@GetMapping("/getById/{studentId}")
	public Student getById(@PathVariable int studentId)
	{
		Student s = studentService.getById(studentId);
		return s;
	}
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student theStudent)
	{
		return studentService.addStudent(theStudent);
	}
	
	
	@PostMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student theStudent)
	{
		return  studentService.updateStudent(theStudent);
	}
	
	@GetMapping("/deleteStudent/{studentId}")
	public String deleteStudent(@PathVariable int studentId)
	{
	return studentService.deleteStudent(studentId);	
	}
}
