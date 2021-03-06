package fr.exercices.introduction;

public class Autocar {

	public static void main(String[] args) {
		String [] tabVilles = {"Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron",
				"La Ferté Saint-Aubin", "Orléans"};
		double [] tabPrix = {3.20, 1.80, 2.30, 4.20, 5.00};
		String depart = "Vierzon", arrivee = "Orléans";
		System.out.println("indice " + arrivee + " = " + Autocar.recupereIndiceVille(arrivee, tabVilles));
		System.out.println("Le prix du trajet entre " + depart + " et " 
				+ arrivee + " est "
				+ Autocar.prixEntreDeuxVilles(depart, arrivee, tabPrix, tabVilles)
				+ "€");
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
		double reduction = 0;
		for (int i = indiceDepart; i < indiceArrivee; i++) {
			prixTrajet = prixTrajet + tabPrix[i] - (tabPrix[i]*(reduction/100));
			reduction += 10;
		}
		return prixTrajet;
	}
}
