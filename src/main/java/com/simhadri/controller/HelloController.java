package com.simhadri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
	
	@GetMapping(value = "/{name}")
	public String getMsg(@PathVariable String name)	{
		
		return "Welcome to HelloWorld "+name;
	}

}
