package com.example.demoMongo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeService {
	@Autowired
	DbServices service;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Employee e)
	{
		System.out.println(e);
		service.save(e);
		return "SUCCESS";
		
		
	}
	
	@GetMapping("/select/{id}")
	public Optional<Employee> select(@PathVariable("id")long id)
	{
		return service.findById(id);
	}
	
	@GetMapping("/selectAll")
	public List<Employee> selectAll()
	{
		return service.findAll();
	}
	
	@GetMapping(value="/delete/{id}")
	public void deleteEmployee(@PathVariable("id")long id)
	{
		
		//employeeDao.findById(id);
		if(service.existsById(id))
			service.deleteById(id);
		else
		System.out.println(id +" id not found");
	}
	
	@PutMapping(value="/update/{id}")
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable("id")long id)
	{
	
		//employeeDao.findById(id);
	
		if(service.existsById(id))
		{
			service.save(emp);
			System.out.println(emp);			
		}
		else
		{
			System.out.println(id +" id not found");
			emp=null;
		}
		return emp;
	}
	
	@GetMapping(value="/getByAge/{age}")
	public ArrayList<Employee> getByAge(@PathVariable("age")int age)
	{
		return service.getByAge(age);
	}
	
	@GetMapping(value="/getByName/{name}")
	public ArrayList<Employee> getByName(@PathVariable("name")String name)
	{
		return service.getByName(name);
	}
}
