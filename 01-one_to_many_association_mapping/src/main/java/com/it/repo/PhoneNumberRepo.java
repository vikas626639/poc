package com.it.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.it.entity.PhoneNumber;

public interface PhoneNumberRepo extends CrudRepository<PhoneNumber, Serializable>{
}
