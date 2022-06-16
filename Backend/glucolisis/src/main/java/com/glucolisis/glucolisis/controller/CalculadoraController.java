package com.glucolisis.glucolisis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	
	@GetMapping("/calculadora")
	public ResponseEntity<Object> holaCalculadora(){
		return new ResponseEntity<>("Calculando",HttpStatus.OK);
	}
	

}
