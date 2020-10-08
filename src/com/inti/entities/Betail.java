package com.inti.entities;

public class Betail extends Animal {
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
