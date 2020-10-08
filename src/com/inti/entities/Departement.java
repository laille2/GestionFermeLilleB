package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Departement implements Serializable {
	private Long idDepartement;
	private String nom;
	private String region;
	public Long getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Departement() {
		super();
	}
	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nom=" + nom + ", region=" + region + "]";
	}
	
	

}
