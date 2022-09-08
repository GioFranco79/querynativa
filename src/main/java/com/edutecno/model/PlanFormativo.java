package com.edutecno.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "plan_formativo")
public class PlanFormativo {
	@Id
	@Column(name = "codigo_plan_formativo")
	private String codigoPlanFormativo;
	private String descripcion;
	private Integer duracionHoras;
	@OneToMany(mappedBy = "codigoPlanFormativo", fetch = FetchType.LAZY)
	private List<Curso> cursos;
}
