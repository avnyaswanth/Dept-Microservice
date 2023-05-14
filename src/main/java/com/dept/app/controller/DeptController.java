package com.dept.app.controller;


import com.dept.app.entity.Department;
import com.dept.app.service.DepartmentService;
import com.dept.app.service.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DeptController {

   @Autowired
    DeptRepo repo;

   @Autowired
   DepartmentService departmentService;

    @GetMapping("/")
    public String getDept() {
        return "dept-controller";
    }

    @GetMapping("/dept/{id}")
    public Optional<Department> getbyid(int deptid) {
        return repo.findById(101);
    }

    @GetMapping("/dept/all")
    public List<Department> Alldept() {
        return departmentService.AllDept();
    }

    @PostMapping("/dept/add")
    public Department AddDept(@RequestBody Department department) {
        Department savedDept = departmentService.CreateDept(department);
        return savedDept;
    }


}
