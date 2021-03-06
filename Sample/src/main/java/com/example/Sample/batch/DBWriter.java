package com.example.Sample.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Sample.entity.Student;
import com.example.Sample.repository.StudentRepository;

@Component
public class DBWriter implements ItemWriter<Student> {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void write(List<? extends Student> items) throws Exception {

		studentRepository.saveAll(items);

	}

}
