package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.Employee;
import com.it.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@GetMapping(value = "/emp")
	public String saveEmployye(){
		boolean employeeSave = service.isEmployeeSave();
		return employeeSave?"Employye record save":"Record not saved";
	}
	
	@GetMapping(value = "/emp/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmpById(@PathVariable("id")Integer id) {
		Employee employeeById = service.getEmployeeById(id);
		return employeeById;
	}
	
}
