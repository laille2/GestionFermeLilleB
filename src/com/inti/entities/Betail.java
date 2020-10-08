package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Betail extends Animal implements Serializable {
	private String techElevage;

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}

	public Betail() {
		super();
	}

	@Override
	public String toString() {
		return "Betail [techElevage=" + techElevage + "]";
	}
	
	

}
