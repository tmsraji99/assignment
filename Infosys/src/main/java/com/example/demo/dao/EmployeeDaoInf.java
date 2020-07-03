package com.example.demo.dao;

import com.example.demo.model.Employee;

public interface EmployeeDaoInf {

	String getEmailById(Integer id);

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Integer id);

}
