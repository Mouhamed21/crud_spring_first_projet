package univ.ensam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.ensam.entities.Employee;
import univ.ensam.persistence.EmployeeRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Collection<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(Long id){
        return employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee e){
        return employeeRepository.save(e);
    }

    public Employee updateEmployee(Employee e){
        return employeeRepository.save(e);
    }

    public void deleteEmployee(Long id){
         employeeRepository.deleteById(id);
    }
}
