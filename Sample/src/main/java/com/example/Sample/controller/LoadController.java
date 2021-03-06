package com.example.Sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.entity.Student;
import com.example.Sample.service.StudentService;

@RestController
@RequestMapping("/load")
public class LoadController {

	@Autowired
	JobLauncher jobLauncher;
	@Autowired
	Job job;
	@Autowired
	private StudentService studentService;

	@GetMapping("/save")
	public BatchStatus load() throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		Map<String, JobParameter> maps = new HashMap<>();
		maps.put("time", new JobParameter(System.currentTimeMillis()));

		JobParameters jobParameter = new JobParameters(maps);
		JobExecution jobExecution = jobLauncher.run(job, jobParameter);
		
		System.out.println("Job Execution  : " + jobExecution.getStatus());
		
		return jobExecution.getStatus();
	}
	
	@GetMapping("/fetch")
	public List<Student> fetch() {
		return studentService.fetch();
	}
}
