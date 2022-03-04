package com.employee.onboarding.engine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.employee.onboarding.engine.entity.Employee;
import com.employee.onboarding.engine.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/employee")
	private List<Employee> getAllEmployee()
	{
		return employeeservice.getAllEmployee(); 
	}
	
	@GetMapping("/employee/{id}")
	private Employee getEmployeeById(@PathVariable("id") int id)
	{
		return employeeservice.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) 
	{
		employeeservice.saveEmployee(employee);
		return employee.getId();
	}
	
	@DeleteMapping("/employee/{id}")
	private void deleteEmployeeById(@PathVariable("id") int id)
	{
		employeeservice.deleteEmployeeById(id);
	}
	
	@DeleteMapping("/employee")
	private void deleteAllEmployee()
	{
		employeeservice.deleteAllEmployee();
	}

}
