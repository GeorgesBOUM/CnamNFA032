package fr.exercices.references;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1, t2, t3, t4, t5;
		t2 = new int[4];
		t3 = new int[4];
		t4 = new int[4];
		for (int i=0; i<t3.length; i++){
		t3[i] = 10+i;
		t4[i] = 10+i;
		}
		t5 = t4;
		
		/**
		 * t1 pointe toujours sur null car n'ayant pas été initialisé
		 * t1 est de ce fait "inutilisable" pour éviter un NullPoiterException
		 * */
		
		/**
		 * t3 et t4 ont chacun leur propre référence et contiennent
		 * 4 cases contenant respectivement
		 * 10, 11, 12, 13
		 * */
		System.out.println("référence t3 " + t3);
		System.out.println("référence t4 " + t4);
		System.out.println("Le contenu de t3");
		for (int i = 0; i < t3.length; i++) {
			System.out.println(t3[i] + " ");
		}
		System.out.println("Le contenu de t4");
		for (int i = 0; i < t4.length; i++) {
			System.out.println(t4[i] + " ");
		}
	}

}
