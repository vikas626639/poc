package com.it.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.entity.Employee;
import com.it.entity.PhoneNumber;
import com.it.repo.EmployeeRepo;
import com.it.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo emp;
	@Override
	public boolean isEmployeeSave() {

		PhoneNumber ph=new PhoneNumber();

		ph.setPhone_number(8962264618l);
		ph.setProvider("airtel");
		ph.setType("home");

		Employee e=new Employee();
		e.setEmp_name("vikas");
		e.setEmp_sal(50000l);
		e.setPhonenumber(Set.of(ph));
		//use repo
		Employee save = emp.save(e);
		return save!=null;
	}
	
	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee=null;
		Optional<Employee> findById = emp.findById(id);
		if(findById.isPresent()) {
			employee = findById.get();
		}
		return employee;
	}
}
