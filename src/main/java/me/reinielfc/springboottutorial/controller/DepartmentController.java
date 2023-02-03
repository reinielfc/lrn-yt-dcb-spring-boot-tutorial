package me.reinielfc.springboottutorial.controller;

import jakarta.validation.Valid;
import me.reinielfc.springboottutorial.entity.Department;
import me.reinielfc.springboottutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService service;
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department saveDepartment(@RequestBody @Valid Department department) {
        LOGGER.info("Saving department {}:", department);
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> fetchDepartmentList() {
        return service.fetchDepartmentList();
    }

    @GetMapping("{id}")
    public Department fetchDepartmentById(@PathVariable Long id) {
        return service.fetchDepartmentById(id);
    }

    @GetMapping("name/{name}")
    public Department fetchDepartmentByName(
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = "false") Boolean ignoreCase) {
        return ignoreCase
                ? service.fetchDepartmentByNameIgnoreCase(name)
                : service.fetchDepartmentByName(name);
    }

    @PutMapping("{id}")
    public Department updateDepartmentById(@PathVariable Long id, @RequestBody @Valid Department update) {
        return service.updateDepartmentById(id, update);
    }

    @DeleteMapping("{id}")
    public String deleteDepartmentById(@PathVariable Long id) {
        service.deleteDepartmentById(id);
        return "Department deleted successfully!!";
    }
}
