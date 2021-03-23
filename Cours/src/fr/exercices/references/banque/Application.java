package fr.exercices.references.banque;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Banque banque = Banque.getInstance();
		
		Titulaire paul = new Titulaire("Paul");
		Titulaire pierre = new Titulaire("Pierre");
		Titulaire fatima = new Titulaire("fatima");
		ArrayList<Titulaire> conjoints = new ArrayList<Titulaire>();
		conjoints.add(paul);
		conjoints.add(fatima);
		
		Compte comptePaul = new Compte(1, paul, 100);
		Compte comptePierre = new Compte(2, pierre, 100);
		Compte compteFatima = new Compte(3, fatima, 100);
		Compte comptePaulEtFatima = new Compte(4, paul, 50);
		comptePaulEtFatima.ajouterTitulaire(fatima);
	}

}
