package com.edutecno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Curso;
import com.edutecno.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {
	@Autowired
	private CursoRepository cursoRepo;
	
	@Override
	public List<Curso> findAll() {
		return cursoRepo.findAll();
	}

}
