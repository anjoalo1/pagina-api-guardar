package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.IPagesRepository;
import com.example.demo.domain.Pages;

@RestController
@RequestMapping("/documentos")
public class ControllerPages {
	
	
	  @Autowired
	    private IPagesRepository iPagesRepository;

	    @PostMapping
	    public ResponseEntity<Pages> crearDocumento(@RequestBody Pages page) {
	        Pages newPage = iPagesRepository.save(page);
	        return new ResponseEntity<>(newPage, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public List<Pages> obtenerTodosLosDocumentos() {
	        return iPagesRepository.findAll();
	    }
	    
	    @GetMapping("/seccion/{seccion}")
	    public List<Pages> obtenerDocumentosPorSeccion( @PathVariable String seccion) {
	        return iPagesRepository.findBySeccion(seccion);
	    }

}
