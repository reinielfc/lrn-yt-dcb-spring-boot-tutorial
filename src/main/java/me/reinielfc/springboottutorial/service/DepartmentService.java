package me.reinielfc.springboottutorial.service;

import me.reinielfc.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id);

    Department fetchDepartmentByName(String name);

    Department fetchDepartmentByNameIgnoreCase(String name);

    Department updateDepartmentById(Long id, Department update);

    void deleteDepartmentById(Long id);

}
