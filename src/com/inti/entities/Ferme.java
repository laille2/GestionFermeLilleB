/**
 * 
 */
package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ferme implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
