package com.udemy.backendNinja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendNinja.service.ServiceExample;
import com.udemy.backendNinja.service.ServiceExample2;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	@Autowired
	ServiceExample serviceExample;
	
	@Autowired
	ServiceExample2 serviceExample2;
	
	
	
	@GetMapping("/holamundo")
	public String exampleString() {
		serviceExample.serviceMethod();
		serviceExample2.service_method_2();
		
		
		
		
		return "helloworld";
	}

}
