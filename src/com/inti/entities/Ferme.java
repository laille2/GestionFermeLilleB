/**
 * 
 */
package com.inti.entities;

import java.util.Date;

public class Ferme {
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	public Long getIdFerme() {
		return idFerme;
	}
	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Ferme() {
		super();
	}
	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}
	
	

}
