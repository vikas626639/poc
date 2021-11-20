package com.it.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.it.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Serializable>{

}
