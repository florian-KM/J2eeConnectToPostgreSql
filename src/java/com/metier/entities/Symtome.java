package com.metier.entities;

public class Symtome {
	
	//les attributs de la classe
	private int id;
	private String nom;
	private String description;
	
	//constructeurs
	public Symtome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Symtome(String nom) {
		super();
		this.nom = nom;
	}

	public Symtome(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
