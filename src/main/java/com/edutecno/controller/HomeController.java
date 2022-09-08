package com.edutecno.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.services.CursoService;
import com.edutecno.services.EstudianteService;
import com.edutecno.services.RegionService;


@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private CursoService cursoService;
	@Autowired
	private RegionService regionService;
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping
	public ModelAndView home(HttpSession httpSession) {
		ModelAndView model = new ModelAndView("index");
		model.addObject("curso", cursoService.findAll());
		model.addObject("region", regionService.findAll());
		model.addObject("estudiantes", estudianteService.findAll());		
		return model;
	}
		
	@PostMapping("/buscartexto")
	public ModelAndView home(@RequestParam("regiones") Integer regiones,@RequestParam("cursos") String cursos) {
		ModelAndView model = new ModelAndView("index");		
		model.addObject("curso", cursoService.findAll());
		model.addObject("region", regionService.findAll());
		if (regiones > 0 && !cursos.equals("0")) {
			model.addObject("estudiantes", estudianteService.findAllByRegionAndCurso(regiones, cursos));
		}
		else {
			if (regiones > 0 && cursos.equals("0")) {
				model.addObject("estudiantes", estudianteService.findAllByRegion(regiones));
			} else {
				if (regiones < 1 && !cursos.equals("0")) {
					model.addObject("estudiantes", estudianteService.findAllByCurso(cursos));
				} else {
					model.addObject("estudiantes", estudianteService.findAll());
				}
			}
		}
		return model;
	}
}
