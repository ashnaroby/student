package com.example.Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
