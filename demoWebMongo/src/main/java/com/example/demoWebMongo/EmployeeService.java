package com.example.demoWebMongo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
	@Autowired
	DbService service;
	@PostMapping("/insert")
	public String insert(@RequestBody Employee e){
		System.out.println(e);
		service.save(e);
		
		return "SUCCESS";
	}
	
	@GetMapping("/retrieve")
	public List<Employee> retrieve(){
		System.out.println("printing result.......");
		System.out.println(service.findAll());
		return service.findAll();
	}
	@GetMapping("/retrieve/{id}")
	//public Optional<Employee> retrieveById(@PathVariable("id")long id){
	public String retrieveById(@PathVariable("id")long id){
		if(service.existsById(id)){
			System.out.println("printing result.......");
			System.out.println(service.findById(id));
			return service.findById(id).toString();
		}
		else{
			return "Id does not exist";
		}
	}
	@PostMapping("/update/{id}")
	public String update(@PathVariable("id")long id,@RequestBody Employee e){
		if(service.existsById(id)){
			System.out.println("updating values.......");
			service.save(e);
			return e.toString();
		}
		else {
			return "Id does not exist";
		}
	}
	@GetMapping("/delete")
	public String delete(){
		System.out.println("deleting values.......");
		service.deleteAll();
		return "Values DELETED";//service.findById(id);
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id")long id){
		if(service.existsById(id)){
			System.out.println("deleting values.......");
			service.deleteById(id);
			return "Values DELETED";
		}
		else{
			return "Id does not exist";
		}
	}	
	@GetMapping("/getByName/{name}")
	public List<Employee> getByName(@PathVariable("name")String name){
		
			System.out.println("printing result.......");
			System.out.println(service.getByName(name));
			return service.getByName(name);	
	}
	@GetMapping("/getByNameAndAge/{name}/{age}")
	public List<Employee> getByNameAndAge(@PathVariable("name")String name,@PathVariable("age")int age){
		
			System.out.println("printing result.......");
			System.out.println(service.getByNameAndAge(name,age));
			return service.getByNameAndAge(name,age);	
	}
	@GetMapping("/getByAge/{age}")
	public List<Employee> getByAge(@PathVariable("age")int age){
		
			System.out.println("printing result.......");
			System.out.println(service.getByAge(age));
			return service.getByAge(age);	
	}
	@GetMapping("/getByAgeBetween/{startAge}/{endAge}")
	public List<Employee> getByAgeBetween(@PathVariable("startAge")int startAge,@PathVariable("endAge")int endAge){
		
			System.out.println("printing result.......");
			System.out.println(service.getByAgeBetween(startAge,endAge));
			return service.getByAgeBetween(startAge,endAge);	
	}
	@GetMapping("/getByAgeGreaterThan/{Age}")
	public List<Employee> getByAgeGreaterThan(@PathVariable("Age")int Age){
			System.out.println("printing result.......");
			System.out.println(service.getByAgeGreaterThan(Age));
			return service.getByAgeGreaterThan(Age);	
	}
}
