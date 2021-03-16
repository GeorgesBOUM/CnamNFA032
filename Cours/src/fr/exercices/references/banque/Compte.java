package fr.exercices.references.banque;

public class Compte {
	private int numero;
	private double solde;
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public double getSolde() {
		return solde;
	}
	public void depot(double d) {
		this.solde += d;
	}
	
	public void retrait(double r) {
		this.solde -= r;
	}
	
	public String toString() {
		return "Solde du compte numéro " + numero + ": " + solde;
	}
}
