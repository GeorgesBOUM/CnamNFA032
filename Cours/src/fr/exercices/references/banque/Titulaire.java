package fr.exercices.references.banque;

import java.util.ArrayList;

public class Titulaire {
	private String nom;
	private ArrayList<Compte> listeDesComptesDuTitulaire;
	
	public Titulaire(String nom) {
		this.nom = nom;
		listeDesComptesDuTitulaire = new ArrayList<Compte>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterCompte(Compte compte) {
		listeDesComptesDuTitulaire.add(compte);
	}
}
