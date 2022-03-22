package univ.ensam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univ.ensam.entities.Department;
import univ.ensam.service.DepartmentService;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/department")
    public Collection<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @PostMapping("/department")
    public Department addDepartment(@RequestBody Department d){
        return departmentService.addDepartment(d);
    }

    @PutMapping("/department")
    public Department updateDepartment(@RequestBody Department d){
        return departmentService.updateDepartment(d);
    }

    @GetMapping("/department/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentService.getDepartment(id);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartmentById(@PathVariable Long id){
        departmentService.deleteDepartment(id);
    }
}
