package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.service.EmployeeService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@GetMapping(value = "/save")
	public String saveEmployye(){
		boolean employeeSave = service.isEmployeeSave();
		return employeeSave?"Employye record save":"Record not saved";
	}
	
}
