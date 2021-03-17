package fr.exercices.references.banque;

import java.util.ArrayList;

public class Banque {
	private String nom;
	private ArrayList<Compte> listeDesComptesDeLaBanque;
	
	private Banque(String nom) {
		this.nom = nom;
		listeDesComptesDeLaBanque = new ArrayList<Compte>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterCompte(Compte compte) {
		listeDesComptesDeLaBanque.add(compte);
	}
	
//	public void creerCompte() {
//		Compte compte = new Compte(0);
//		//compte.ajouterTitulaire(titulaire);
//	}
}
