package univ.ensam.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univ.ensam.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
