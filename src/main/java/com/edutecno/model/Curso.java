package com.edutecno.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "curso")
public class Curso {
	@Id
	@Column(name = "codigo_curso")
	private String codigoCurso;
	private Date fechaInicio;
	@Column(name = "fecha_termno")
	private Date fechaTermino;
	@OneToMany(mappedBy = "codigoCurso", fetch = FetchType.LAZY)
	private List<Estudiante> estudiantes;
	@ManyToOne
	@JoinColumn(name = "codigo_plan_formativo")
	private PlanFormativo codigoPlanFormativo;
}
