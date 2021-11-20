package com.it.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer emp_id;
	private String emp_name;
	private Long emp_sal;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL)
	@JoinColumn(name="emp_fk_id",referencedColumnName = "emp_id")
	private Set<PhoneNumber> phonenumber;
}
