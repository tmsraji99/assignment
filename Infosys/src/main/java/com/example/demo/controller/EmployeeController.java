package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServiceInf;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceInf employeeServiceInf;

	@RequestMapping(method = RequestMethod.GET, path = "/getemployeedetails/{id}", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ResponseEntity<Employee> getEmployeeById(@PathParam("id") final Integer id) {
	
		Employee employeeById = employeeServiceInf.getEmployeeById(id);
		return new ResponseEntity<Employee>(employeeById, HttpStatus.OK);
	}

	@PostMapping(produces = { MediaType.APPLICATION_XML_VALUE} , consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, path = "/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

		if (employee.getEmail() == null)
			return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		else if (employee.getSal() == null)
			return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		else {
			//employeeServiceInf.saveEmployee(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "getemailbyid/{id}")
	public ResponseEntity<String> getByEmail(@PathVariable("id") final Integer id) {

		if (id != null) {
			String emailById = employeeServiceInf.getEmailById(id);
			return new ResponseEntity<String>(emailById, HttpStatus.OK);
		} else
			return new ResponseEntity<String>("Invalid id", HttpStatus.BAD_REQUEST);

	}

}
