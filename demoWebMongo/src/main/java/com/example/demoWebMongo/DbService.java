package com.example.demoWebMongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface DbService extends MongoRepository<Employee, Long> { //entity,typeId
	public List<Employee> getByName(String name);
	public List<Employee> getByNameAndAge(String name, int age);
	public List<Employee> getByAge(int age);
	public List<Employee> getByAgeBetween(int startAge,int endAge);
	public List<Employee> getByAgeGreaterThan(int Age);
}

