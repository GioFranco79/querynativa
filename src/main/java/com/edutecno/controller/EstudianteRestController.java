package com.edutecno.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.model.Estudiante;
import com.edutecno.services.EstudianteService;

@RestController
@RequestMapping("/api/v1")
public class EstudianteRestController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping("/estudiantes")	
	public ResponseEntity<List<Estudiante>> getAllEstudiantes(){		
		try {
			List<Estudiante> estudiantes = new ArrayList<Estudiante>();			
			estudiantes = estudianteService.findAll();			
			if (estudiantes.isEmpty()) {
				return new ResponseEntity<>(estudiantes, HttpStatus.NO_CONTENT); 
			}
			return new ResponseEntity<>(estudiantes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}	
}
