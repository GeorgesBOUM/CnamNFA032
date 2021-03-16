package fr.exercices.references;

public class ClassesEtObjets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 var1, var2, var3;
		C2 cou1, cou2, cou3, cou4, cou5, cou6;
		var1 = new C1(0);
		var2 = new C1(1);
		cou2 = new C2();
		cou3 = new C2();
		cou4 = new C2();
		cou6 = new C2();
		cou3.premier = var1;

		cou3.second = var2;
		cou4.premier = var1;
		cou4.second = var1;
		cou5 = cou3;
		cou6.premier = var1;
		cou6.second = new C1(2);
	}
}

class C1{
	int x;
	C1(int i){
		x=i;
	}
}

class C2{
	C1 premier, second;
}
