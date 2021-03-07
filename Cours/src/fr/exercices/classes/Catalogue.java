package fr.projet.commerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public final class Catalogue {
	private ArrayList<Produit> listeDeProduits;
	
	public Catalogue() {
		listeDeProduits = new ArrayList<Produit>();
	}
	
	public void afficherCatalogue() {
		if (listeDeProduits.isEmpty()) {
			System.out.println("Catalogue vide");
		} else {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("------------- Catalogue -------------");
			for (int i = 0; i < listeDeProduits.size(); i++) {
				listeDeProduits.get(i).toString();
			}
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}
	}
	
	public void ajouterProduit(String nom, double prix) {
		Optional<Produit> produit = chercherProduit(nom);
		if (!produit.isPresent()) {
			listeDeProduits.add(new Produit(nom, prix));
		} 
	}
	
	public Optional<Produit> chercherProduit(String nom) {
		Iterator<Produit> iterator = listeDeProduits.iterator();
		Optional<Produit> produitOptional = Optional.empty();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Produit produit = (Produit) iterator.next();
			if (produit.getNom().equals(nom)) {
				trouve = true;
				produitOptional = Optional.of(produit);
			}
		}
		return produitOptional;
	}
	
	public void afficherProduit(String nom) {
		Optional<Produit> produitOptional = chercherProduit(nom);
		if (produitOptional.isPresent()) {
			produitOptional.get().toString();
		}
	}
}
