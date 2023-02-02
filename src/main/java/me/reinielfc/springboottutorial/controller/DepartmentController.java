package me.reinielfc.springboottutorial.controller;

import me.reinielfc.springboottutorial.entity.Department;
import me.reinielfc.springboottutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> fetchDepartmentList() {
        return service.fetchDepartmentList();
    }


}
