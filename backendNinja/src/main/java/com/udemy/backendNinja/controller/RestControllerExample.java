package com.udemy.backendNinja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.backendNinja.model.Persona;

@RestController
@RequestMapping("/rest")
public class RestControllerExample {
	
	@GetMapping("/example")
	public ResponseEntity<String> methodRest(){
		
//		List<Persona> objeto_lista_persona = new ArrayList<>();
//		List lista_no_generica = new ArrayList<>();
		
		return new ResponseEntity<String>("String2", HttpStatus.OK);
	}
	
	@GetMapping("/example2")
	public ResponseEntity<Persona> methodRest2(){
		Persona ps = new Persona(18, "Peter", "Ohio");
		return new ResponseEntity<Persona>(ps, HttpStatus.OK);
	}

}
