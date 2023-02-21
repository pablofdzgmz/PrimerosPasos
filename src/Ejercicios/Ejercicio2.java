package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		double pista=755;
		int participantes=0;
		int jueces=0;
		do {
			participantes++;
			pista-=8.70;
			if(participantes%3==0) {
				jueces++;
				pista-=8.70/2;
			}
		}while(pista>8.70);
		System.out.print("Podran concursar "+participantes+" personas.Habra "
		+jueces+" jueces en la pista. Quedaran ");
		System.out.printf("%1.2f", pista);
		System.out.print(" m2 de pista libre.");
	}

}
