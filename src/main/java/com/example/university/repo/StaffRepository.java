package com.example.university.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.university.domain.Staff;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {

}
