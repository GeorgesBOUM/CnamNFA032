package fr.exercices.references.banque;

import java.util.ArrayList;

public class Banque {
	private String nom;
	private ArrayList<Compte> listeDesComptesDeLaBanque;
	private static Banque instance = new Banque("uneBanque");
	
	private Banque(String nom) {
		this.nom = nom;
		listeDesComptesDeLaBanque = new ArrayList<Compte>();
	}
	
	public static Banque getInstance() {
		return Banque.instance;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterCompte(Compte compte) {
		listeDesComptesDeLaBanque.add(compte);
	}
	
//	public void creerCompte(ArrayList<Titulaire> listeTitulaires, double depotInitial) {
//		Compte compte = new Compte(depotInitial);
//		
//	}
}
