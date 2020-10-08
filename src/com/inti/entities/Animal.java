package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Animal implements Serializable {
	private Long idAnimal;
	private boolean etat;
	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}
	
	

}
