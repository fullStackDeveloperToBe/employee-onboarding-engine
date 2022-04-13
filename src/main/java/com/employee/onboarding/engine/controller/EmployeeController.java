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
import com.employee.onboarding.engine.utility.Logging;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@Autowired
	Logging logUtil;
	
	@GetMapping("/employee")
	private List<Employee> getAllEmployee()
	{
		logUtil.logInfo("Get Mapping for getting All Employees");
		return employeeservice.getAllEmployee(); 
	}
	
	@GetMapping("/employee/{id}")
	private Employee getEmployeeById(@PathVariable("id") int id)
	{
		logUtil.logInfo("Get Mapping for getting Particular Employee");
		return employeeservice.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) 
	{
		logUtil.logInfo("Post Mapping for posting Employee");
		employeeservice.saveEmployee(employee);
		return employee.getId();
	}
	
	@DeleteMapping("/employee/{id}")
	private void deleteEmployeeById(@PathVariable("id") int id)
	{
		logUtil.logInfo("Delete particular Employees");
		employeeservice.deleteEmployeeById(id);
	}
	
	@DeleteMapping("/employee")
	private void deleteAllEmployee()
	{
		logUtil.logInfo("Delete All Employees");
		employeeservice.deleteAllEmployee();
	}
	
	@GetMapping("/em")
	private void Ste()
	{
		logUtil.logInfo("Get Mapping for getting Particular Employee");
		System.out.println("Hai");
	}
	

}
