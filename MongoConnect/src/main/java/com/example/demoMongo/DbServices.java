package com.example.demoMongo;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface DbServices extends MongoRepository<Employee,Long> {

	

	ArrayList<Employee> getByAge(int age);
	ArrayList<Employee> getByName(String name);
}
