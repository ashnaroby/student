package com.example.Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sample.entity.Student;
import com.example.Sample.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> fetch() {
		return studentRepository.findAll();
	}
}
