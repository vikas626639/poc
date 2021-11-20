package com.it.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PhoneNumber {
	@Id
	private Long phone_number;
	private String type;
	private String provider;
}
