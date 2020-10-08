package com.inti.entities;

public class Gerant {
	private Long idGerant;
	private String nom;
	private String prenom;
	public Long getIdGerant() {
		return idGerant;
	}
	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Gerant() {
		super();
	}
	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
