
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Suena michel";		
		System.out.println("Mi nombre es " + nombre );
		
		//longitud string (length)
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres");

		//Devuelve el caracter indicado (charAt(numero))
		System.out.println("La primera letra de mi nombres es " + nombre.charAt(0));
	
		//Devolver ultimo caracter de cualquier nombre
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
	
	}

}
