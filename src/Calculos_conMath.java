
public class Calculos_conMath {

	public static void main(String[] args) {
		// Raiz cuadrada ( sqrt )
		
		//double raiz=Math.sqrt(9);
		
		
		//Redondear Numeros (round )
		double num1=5.85;
		
		int resultado=(int)Math.round(num1);		
		System.out.println(resultado);

		//Elevar una base a una potencia ( pow )
		double base=5;
		double exponente=3;
		
		int resultado2=(int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " 
		+ exponente + " = " + resultado2) ;

		
	}

}
