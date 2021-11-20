package com.it.entity;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Address {
	@Id
	private String state;
	private String district;
	private String area;
	private Long pincode;
}
