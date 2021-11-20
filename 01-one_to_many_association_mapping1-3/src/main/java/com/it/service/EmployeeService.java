package com.it.service;

import com.it.entity.Employee;

public interface EmployeeService {
	boolean isEmployeeSave();
	Employee getEmployeeById(Integer id);
}
