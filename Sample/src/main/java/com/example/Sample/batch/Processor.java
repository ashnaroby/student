package com.example.Sample.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.Sample.entity.Student;

@Component
public class Processor implements ItemProcessor<Student, Student> {

	@Override
	public Student process(Student item) throws Exception {
		return item;
	}

}
