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
		 * */
		
		
	}

}
