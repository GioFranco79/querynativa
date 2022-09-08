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
@Table(name = "region")
public class Region {
	@Id
	@Column(name = "codigo_region")
	private Integer codigoRegion;
	private String nombre;
	@OneToMany(mappedBy = "codigoRegion", fetch = FetchType.LAZY)
	private List<Comuna> comunas;
}
