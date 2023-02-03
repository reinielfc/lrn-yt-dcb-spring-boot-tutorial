package me.reinielfc.springboottutorial.service;

import me.reinielfc.springboottutorial.entity.Department;
import me.reinielfc.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;

    Department fetchDepartmentByName(String name);

    Department fetchDepartmentByNameIgnoreCase(String name);

    Department updateDepartmentById(Long id, Department update) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long id);

}
