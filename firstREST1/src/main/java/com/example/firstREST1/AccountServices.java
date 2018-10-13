package com.example.firstREST1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Contoller + @RequestMapping
public class AccountServices {

	@GetMapping(value="/hello/{any}")
	public String sayHello(@PathVariable("any")String name)
	{
		return "Hello" +name;
	}
}
