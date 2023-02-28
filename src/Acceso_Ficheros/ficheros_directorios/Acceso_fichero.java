package Acceso_Ficheros.ficheros_directorios;
import java.io.*;

public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para leer archivos de carpetas
		File ruta=new File("C:/Users/Pibol/Desktop/java_ser");
		System.out.println(ruta.getAbsolutePath());
		String[] nombres_archivos=ruta.list();
		for(int i=0;i<nombres_archivos.length;i++) {
			System.out.println(nombres_archivos[i]);
			//Para leer archivos de carpetas dentro de carpetas
			File f=new File(ruta.getAbsolutePath(), nombres_archivos[i]);
			if(f.isDirectory()) {//para comprobar si es una carpeta
				String[] archivos_subcarpeta=f.list();
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					System.out.println(archivos_subcarpeta[j]);
				}		
			}
		}
	}

}
