package com.inti.entities;

public class BasseCour extends Animal {
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
