package com.example.university.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.university.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
