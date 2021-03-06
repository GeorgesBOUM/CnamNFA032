package fr.exercices.introduction;

public class Autocar {

	public static void main(String[] args) {
		
	}
	
	public static int recupereIndiceVille(String nomVille, String [] tabVilles) {
		int indice = -1;
		boolean trouve =  false;
		while (indice < tabVilles.length && !trouve) {
			indice++;
			if (nomVille.equals(tabVilles[indice])) {
				trouve = true;
			}
		}
		return indice;
	}
}
