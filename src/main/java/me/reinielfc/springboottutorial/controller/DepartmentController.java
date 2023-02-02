package me.reinielfc.springboottutorial.controller;

import me.reinielfc.springboottutorial.entity.Department;
import me.reinielfc.springboottutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private final DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

}
