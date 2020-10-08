package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Eleveur implements Serializable {
	private Long idEleveur;
	private String nom;
	private int age;
	private boolean statut;
	public Long getIdEleveur() {
		return idEleveur;
	}
	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public Eleveur() {
		super();
	}
	@Override
	public String toString() {
		return "Eleveur [idEleveur=" + idEleveur + ", nom=" + nom + ", age=" + age + ", statut=" + statut + "]";
	}
	
	

}
