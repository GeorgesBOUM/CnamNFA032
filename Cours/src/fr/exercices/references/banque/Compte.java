package fr.exercices.references.banque;

import java.util.ArrayList;

public class Compte {
	private int numero;
	private double solde;
	private ArrayList<Titulaire> listeDesTitulaires;
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
		this.listeDesTitulaires = new ArrayList<Titulaire>();
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
