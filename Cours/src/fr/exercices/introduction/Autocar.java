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
	
	public static double prixEntreDeuxVilles(String depart, String arrivee,
			double [] tabPrix, String [] tabVilles) {
		int indiceDepart = Autocar.recupereIndiceVille(depart, tabVilles);
		int indiceArrivee = Autocar.recupereIndiceVille(arrivee, tabVilles);
		double prixTrajet = 0;
		int reduction = 0;
		for (int i = indiceDepart; i <= indiceArrivee; i++) {
			prixTrajet = prixTrajet + tabPrix[i] - tabPrix[i]*(reduction/100);
			reduction += 10;
		}
		return prixTrajet;
	}
}
