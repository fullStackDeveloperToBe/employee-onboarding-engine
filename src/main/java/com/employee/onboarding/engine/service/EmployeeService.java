package com.employee.onboarding.engine.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.onboarding.engine.entity.Employee;
import com.employee.onboarding.engine.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> employee = new ArrayList<Employee>();
		employeerepository.findAll().forEach(emp -> employee.add(emp));
		return employee;
	}
	
	public Employee getEmployeeById(int id)
	{
		return employeerepository.findById(id).get();
	}
	
	public void saveEmployee(Employee employee) 
	{
		employeerepository.save(employee);
	}
	
	public void deleteEmployeeById(int id)
	{
	    employeerepository.deleteById(id);
	}
	
	public void deleteAllEmployee()
	{
		employeerepository.deleteAll();
		
	}

}
