package com.example.demo.services;

import com.example.demo.model.Employee;

public interface EmployeeServiceInf {
	String getEmailById(Integer id);

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Integer id);
	
	

}
