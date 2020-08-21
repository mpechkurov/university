package com.example.university.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
