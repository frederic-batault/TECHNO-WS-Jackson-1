package com.objis.mavenapps;

public class Employe {

	// proprietes

	private String nom;
	private String prenom;

	// get/set
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

	// constructeur
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Employe() {
		super();
	}

	// méthode metier

	public void poserConges() {
		System.out.println("L'employé " + prenom + " " + nom + " pose des congés.");

	}
}
