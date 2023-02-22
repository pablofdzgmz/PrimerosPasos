package Ejercicios;
import java.util.*;

public class Ejercicio_Excepcion_German {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(contador<10) {
			try {
				pedirNumero();
			}
			catch(InputMismatchException e) {
				System.out.println("TE HE DICHO NUMEROS, NO COSAS RARAS.¡¡ DALE OTRA VEZ !!");
			}
		}
		verNumeros();

	}
	static void pedirNumero(){
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce numero");
			numeros[contador]=entrada.nextInt();
			contador++;	
	}
	static void verNumeros() {
		for(int i=0;i<10;i++) {
			System.out.print(""+numeros[i]);
		}
	}
	static int numeros[]=new int[10];
	static int contador=0;
}
