package Acceso_Ficheros.ficheros_directorios;
import java.io.*;

public class creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta=new File("C:/Users/Pibol/Desktop/java_ser/prueba_texto.txt");
		//ruta.mkdir(); //crea nueva carpeta/directorio
		String archivo_destino=ruta.getAbsolutePath();
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Escribiendo accede_es=new Escribiendo();
		accede_es.escribir(archivo_destino);
	}
}

class Escribiendo{
	public void escribir(String ruta_archivo) {
		String frase="Esto es un ejemplo. Espero que salga";
		try {
			FileWriter escritura=new FileWriter(ruta_archivo);
			for(int i=0;i<frase.length();i++) {
				System.out.print(frase.charAt(i));
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		}catch(IOException e) {
			System.out.println("ERROR");
		}
	}
}