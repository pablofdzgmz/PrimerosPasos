package Acceso_Ficheros.escribiendo;
import java.io.*;

public class escribiendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo_Fichero accede_es=new Escribiendo_Fichero();
		accede_es.escribir();
	}

}

class Escribiendo_Fichero{
	public void escribir() {
		String frase="Esto es una prueba de escritura";
		try {
			FileWriter escritura=new FileWriter("C:/Users/Pibol/Desktop/texto_nuevo.txt", true);
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}