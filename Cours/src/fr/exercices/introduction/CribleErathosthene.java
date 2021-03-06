package fr.exercices.introduction;

public class CribleErathosthene {

	public static void main(String[] args) {
	}
	
	public static boolean [] cribleSimple(int n) {
		boolean [] tab = new boolean[n+1];
		tab[0] = false;
		tab[1] = false;
		for (int i = 2; i <= n; i++) {
			tab[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (tab[i]) {
				for (int j = 2; i*j <= n; j++) {
					tab[i*j] = false;
				}
			}
		}
		return tab;
	}
	
	public static boolean testPrimalite(int n) {
		return CribleErathosthene.cribleSimple(n)[n];
	}
	
	// De larges possibilités d'améliorations
}
