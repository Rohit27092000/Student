package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> student = studentRepository.findAll();
		return student;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> s = studentRepository.findById(id);
		return s.get();
	}
	
	@Override
	public String addStudent(Student theStudent)
	{
		studentRepository.save(theStudent);
		return "Success";
	}

	@Override
	public Student updateStudent(Student theStudent) {
		
		return  studentRepository.save(theStudent);
	}

	@Override
	public String deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);;
		return "Success";
	}

	
}
