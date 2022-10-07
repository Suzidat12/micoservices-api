package com.test.department.controller;

import com.test.department.entity.Department;
import com.test.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside the saveDepartment controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside the findDepartmentById controller");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/")
    public List<Department> fetchDepartment(){
        log.info("Inside the saveDepartment controller");
        return departmentService.fetchDepartment();
    }
    @GetMapping("/message")
    public String test() {
        return "Hello this is my first microservice";
    }
}
