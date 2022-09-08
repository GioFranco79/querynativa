package com.edutecno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
	
	@Query(value = "SELECT * FROM estudiante e JOIN curso c ON e.codigo_curso = c.codigo_curso JOIN plan_formativo p ON c.codigo_plan_formativo = p.codigo_plan_formativo JOIN comuna c2 ON e.codigo_comuna = c2.codigo_comuna JOIN region r ON c2.codigo_region = r.codigo_region", nativeQuery = true)
	public List<Estudiante> findAll();

	@Query(value = "SELECT * FROM estudiante e JOIN curso c ON e.codigo_curso = c.codigo_curso JOIN plan_formativo p ON c.codigo_plan_formativo = p.codigo_plan_formativo JOIN comuna c2 ON e.codigo_comuna = c2.codigo_comuna JOIN region r ON c2.codigo_region = r.codigo_region WHERE r.codigo_region = :region", nativeQuery = true)
	public List<Estudiante> findAllByRegion(Integer region);

	@Query(value = "SELECT * FROM estudiante e JOIN curso c ON e.codigo_curso = c.codigo_curso JOIN plan_formativo p ON c.codigo_plan_formativo = p.codigo_plan_formativo JOIN comuna c2 ON e.codigo_comuna = c2.codigo_comuna JOIN region r ON c2.codigo_region = r.codigo_region WHERE c.codigo_curso = :curso", nativeQuery = true)
	public List<Estudiante> findAllByCurso(String curso);

	@Query(value = "SELECT * FROM estudiante e JOIN curso c ON e.codigo_curso = c.codigo_curso JOIN plan_formativo p ON c.codigo_plan_formativo = p.codigo_plan_formativo JOIN comuna c2 ON e.codigo_comuna = c2.codigo_comuna JOIN region r ON c2.codigo_region = r.codigo_region WHERE r.codigo_region = :region AND c.codigo_curso = :curso", nativeQuery = true)
	public List<Estudiante> findAllByRegionAndCurso(Integer region, String curso);

}
