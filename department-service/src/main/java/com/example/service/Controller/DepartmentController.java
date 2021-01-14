package com.example.service.Controller;

import javax.websocket.server.PathParam;

import com.example.service.Entity.Department;
import com.example.service.Service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside saveDepartment method of department controller");
        System.out.println("hit!");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{did}")
    public Department findByDid(@PathVariable("did") int id) {
        log.info("inside findByDid method of department controller");

        return departmentService.findByDid(id);
    }
}
