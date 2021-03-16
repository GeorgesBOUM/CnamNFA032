package fr.exercices.references.banque;

import java.util.ArrayList;

public class Banque {
	private String nom;
	private ArrayList<Compte> listeComptes;
	
	public Banque(String nom) {
		this.nom = nom;
		listeComptes = new ArrayList<Compte>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterCompte(Compte compte) {
		listeComptes.add(compte);
	}
}
