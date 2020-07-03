package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private String name;
	private String sal;
	private String dept;
	private String id;
	private String port;
	private String email;
	private String password;

}
