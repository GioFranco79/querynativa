package com.edutecno.model;

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
@Table(name = "comuna")
public class Comuna {
	@Id
	@Column(name = "codigo_comuna")
	private Integer codigoComuna;
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "codigo_region")
	private Region codigoRegion;
	@OneToMany(mappedBy = "codigoComuna", fetch = FetchType.LAZY)
	private List<Estudiante> estudiantes;	
}
