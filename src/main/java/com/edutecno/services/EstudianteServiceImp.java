package com.edutecno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Estudiante;
import com.edutecno.repository.EstudianteRepository;

@Service
public class EstudianteServiceImp implements EstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepo;
	
	@Override
	public List<Estudiante> findAll() {		
		return estudianteRepo.findAll();
	}

	public List<Estudiante> findAllByRegion(Integer region) {
		return estudianteRepo.findAllByRegion(region);
	}

	public List<Estudiante> findAllByCurso(String curso) {		
		return estudianteRepo.findAllByCurso(curso);
	}

	@Override
	public List<Estudiante> findAllByRegionAndCurso(Integer region, String curso) {
		return estudianteRepo.findAllByRegionAndCurso(region, curso);
	}

}
