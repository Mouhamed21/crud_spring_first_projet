package univ.ensam.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univ.ensam.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
