package com.udemy.backendNinja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hola")
	public @ResponseBody String helloworld() {
		return "Hola mundo!!!";
	}

}
