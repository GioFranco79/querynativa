package com.edutecno.services;

import java.util.List;

import com.edutecno.model.Estudiante;

public interface EstudianteService {
	public List<Estudiante> findAll();
	public List<Estudiante> findAllByRegion(Integer region);
	public List<Estudiante> findAllByCurso(String curso);
	public List<Estudiante> findAllByRegionAndCurso(Integer region, String curso);		
}
