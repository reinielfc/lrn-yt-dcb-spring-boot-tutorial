package me.reinielfc.springboottutorial.service;

import me.reinielfc.springboottutorial.entity.Department;
import me.reinielfc.springboottutorial.error.DepartmentNotFoundException;
import me.reinielfc.springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException {
        return departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("Department not found!"));
    }

    @Override
    public Department fetchDepartmentByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public Department fetchDepartmentByNameIgnoreCase(String name) {
        return departmentRepository.findByNameIgnoreCase(name);
    }

    @Override
    public Department updateDepartmentById(Long id, Department update) throws DepartmentNotFoundException {
        Department department = fetchDepartmentById(id);

        department.setName(update.getName());
        department.setAddress(update.getAddress());
        department.setCode(update.getCode());

        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

}
