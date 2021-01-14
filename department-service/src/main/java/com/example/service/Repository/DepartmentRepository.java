package com.example.service.Repository;

import com.example.service.Entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByDid(int id);
}
