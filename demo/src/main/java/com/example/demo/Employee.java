package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {

	@Autowired
	@Qualifier("lads")
	Address ads;
	public void welcome()
	{
		System.out.println("Hello" +  ads.getBuildName());
	}
}
