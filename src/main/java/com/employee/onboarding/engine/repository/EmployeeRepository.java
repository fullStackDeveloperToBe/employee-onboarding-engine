package com.employee.onboarding.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.onboarding.engine.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	//public Employee findByemployeeIdAndname(String employeeId, String name);

}
