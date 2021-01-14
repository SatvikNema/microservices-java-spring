package com.example.service.Service;

import com.example.service.Entity.Department;
import com.example.service.Repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDaprtment of departmentService");
        return departmentRepository.save(department);
    }

    public Department findByDid(int id) {
        log.info("inside findByDid of departmentService");
        return departmentRepository.findByDid(id);
    }

}
