package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDaoInf;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInf {

	EmployeeDaoInf dao;

	public void setDao(EmployeeDaoInf dao) {
		this.dao = dao;
	}

	public String getEmailById(Integer id) {
		String emailById = dao.getEmailById(id);

		if (emailById == null)
			return null;
		else
			return emailById;
	}

	public Employee saveEmployee(Employee employee) {
		if (employee==null) {
			return null;
		} else {
			return dao.saveEmployee(employee);
		}
	}

	private boolean checkEmailExitsOrNot(String email) {

		return true;
	}

	public Employee getEmployeeById(Integer id) {

		Employee employeeById = dao.getEmployeeById(id);

		if (employeeById == null)
			return null;
		else
			return employeeById;
	}
}
