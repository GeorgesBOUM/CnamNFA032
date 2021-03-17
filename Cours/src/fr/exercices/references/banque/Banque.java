package fr.exercices.references.banque;

import java.util.ArrayList;

public class Banque {
	private String nom;
	private ArrayList<Compte> listeDesComptesDeLaBanque;
	
	public Banque(String nom) {
		this.nom = nom;
		listeDesComptesDeLaBanque = new ArrayList<Compte>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterCompte(Compte compte) {
		listeDesComptesDeLaBanque.add(compte);
	}
}
