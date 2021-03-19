package fr.exercices.references.banque;

import java.util.ArrayList;

/**
 * Pour simplifier, on oblitère la notion de numéro de compte.
 * Chaque compte sera "identifié" par son index dans la liste des
 * comptes de la banque.
 * */
public class Compte {
	private int numero;
	private double solde;
	private Titulaire titulaire;
	
	public Compte(int numero, Titulaire titulaire, double solde) {
		this.numero = numero;
		this.solde = solde;
		this.titulaire = titulaire;
	}
	
	public double getSolde() {
		return solde;
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
