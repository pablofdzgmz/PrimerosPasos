package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		double pista=755;
		int participantes=0;
		int jueces=0;
		do {
			participantes++;
			pista-=8.70;
			if(participantes%6==0) {
				jueces++;
				pista-=8.70/2;
			}
			if(pista<=(8.70*4)+(8.70/2) && participantes%2==0) {
				break;
			}
		}while(pista>=(8.70*2));
		System.out.print("Podran concursar "+participantes+" personas.Habra "
		+jueces+" jueces en la pista. Quedaran ");
		System.out.printf("%1.2f", pista);
		System.out.print(" m2 de pista libre.");
	}

}
