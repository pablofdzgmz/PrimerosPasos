import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10000.0;
		
		//printf nos pide dos parametros, 1.4f dará 4 decimales.
		System.out.printf("%1.4f" ,x/3);
		
		//Usamos clase double y su funcion parsedouble para pasar texto a numerico double
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		double num2=Double.parseDouble(num1);
		System.out.print("La raiz de " +num2+ " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		

	}

}
