package fr.exercices.references.banque;

import java.util.ArrayList;

/**
 * Un compte sera identifié par son numéro
 * */
public class Compte {
	private int numero;
	private double solde;
	private Titulaire titulaire;
	private ArrayList<Titulaire> listeDesTitulaires;
	
	public Compte(int numero, Titulaire titulaire, double solde) {
		this.numero = numero;
		this.solde = solde;
		this.titulaire = titulaire;
		listeDesTitulaires = new ArrayList<Titulaire>();
	}
	
	public double getSolde() {
		return solde;
	}
	
	public Titulaire getTitulaire() {
		return this.titulaire;
	}
	
	public ArrayList<Titulaire> getListeDesTitulaires(){
		return listeDesTitulaires;
	}
	
	public void depot(double d) {
		this.solde += d;
	}
	
	public void retrait(double r) {
		this.solde -= r;
	}
	
	public void ajouterTitulaire(Titulaire titulaire) {
		listeDesTitulaires.add(titulaire);
	}
	
	public String toString() {
		return "Solde du compte numéro " + numero + ": " + solde;
	}
}
