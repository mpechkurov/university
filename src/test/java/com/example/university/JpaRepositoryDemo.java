package com.example.university;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.university.domain.Department;
import com.example.university.repo.DepartmentRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class JpaRepositoryDemo {
    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    public void jpaRepositoryDemo() {
        departmentRepository.save(new Department("Humanities"));
        departmentRepository.flush();

        departmentRepository.saveAndFlush(new Department("Fine Arts"));

        departmentRepository.save(new Department("Social Science"));
        System.out.println("3 Departments");

        departmentRepository.findAll().forEach(System.out::println);

        departmentRepository.deleteInBatch(departmentRepository.findAll().subList(0, 1));

        System.out.println("1 less department");
        departmentRepository.findAll().forEach(System.out::println);

        departmentRepository.deleteAllInBatch();
        System.out.println("Zero department");
        departmentRepository.findAll().forEach(System.out::println);
    }

}
