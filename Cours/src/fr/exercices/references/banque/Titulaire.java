package fr.exercices.references.banque;

import java.util.ArrayList;

public class Titulaire {
	private String nom;
	private ArrayList<Compte> listeComptes;
	
	public Titulaire(String nom) {
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
