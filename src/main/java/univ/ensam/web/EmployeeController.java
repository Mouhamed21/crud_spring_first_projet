package univ.ensam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univ.ensam.entities.Employee;
import univ.ensam.service.EmployeeService;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public Collection<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee e){
        return employeeService.addEmployee(e);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee e){
        return employeeService.updateEmployee(e);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);
    }

}
