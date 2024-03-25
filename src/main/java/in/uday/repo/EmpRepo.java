package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
