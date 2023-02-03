package me.reinielfc.springboottutorial.repository;

import me.reinielfc.springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
    Department findByNameIgnoreCase(String name);
}
