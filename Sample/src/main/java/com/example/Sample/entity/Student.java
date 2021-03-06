package com.example.Sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private Long id;
	
	@Column(name ="Name")
	private String name;
	
	@Column(name ="Email")
	private String email;
	
	@Column(name ="Age")
	private Long age;
	
	@Column(name ="TotalMarks")
	private Double totalMarks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Double totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
