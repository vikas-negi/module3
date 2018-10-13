package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="lads")
public class Address {

	public String getBuildName()
	{
		return "Taj Hotel";
	}
}
