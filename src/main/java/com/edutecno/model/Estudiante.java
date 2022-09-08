package com.edutecno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@Column(name = "id_estudiante")
	private Integer idEstudante;
	private String rut;
	private String Nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	@ManyToOne	
	@JoinColumn(name = "codigo_comuna")
	private Comuna codigoComuna;
	@ManyToOne
	@JoinColumn(name = "codigo_curso")
	private Curso codigoCurso;
}
