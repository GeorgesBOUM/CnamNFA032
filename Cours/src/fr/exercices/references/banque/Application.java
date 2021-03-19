package fr.exercices.references.banque;

public class Application {

	public static void main(String[] args) {
		Banque banque = Banque.getInstance();
		
		Titulaire paul = new Titulaire("Paul");
		Titulaire pierre = new Titulaire("Pierre");
		Titulaire fatima = new Titulaire("fatima");
	}

}
