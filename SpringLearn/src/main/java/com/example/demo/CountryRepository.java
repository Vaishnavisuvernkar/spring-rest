package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,String>{
	
	List<Country> findAll();
	Country findByCode(String code);
}
