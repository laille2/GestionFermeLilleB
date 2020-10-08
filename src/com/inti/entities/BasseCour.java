package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class BasseCour extends Animal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String habitat;

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public BasseCour() {
		super();
	}

	@Override
	public String toString() {
		return "BasseCour [habitat=" + habitat + "]";
	}
	
	

}
