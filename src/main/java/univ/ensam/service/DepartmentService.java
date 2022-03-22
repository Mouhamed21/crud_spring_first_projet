package univ.ensam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.ensam.entities.Department;
import univ.ensam.persistence.DepartmentRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public Collection<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    public Department addDepartment(Department d){
        return departmentRepository.save(d);
    }
    public Department updateDepartment(Department d){
        return departmentRepository.save(d);
    }
    public Optional<Department> getDepartment(Long id){
        return departmentRepository.findById(id);
    }

    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }
}
