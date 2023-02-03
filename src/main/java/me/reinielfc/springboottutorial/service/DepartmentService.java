package me.reinielfc.springboottutorial.service;

import me.reinielfc.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id);

    void deleteDepartmentById(Long id);
}
