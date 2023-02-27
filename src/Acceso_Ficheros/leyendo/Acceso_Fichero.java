package Acceso_Ficheros.leyendo;
import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		Leer_Fichero accediendo=new Leer_Fichero();
		accediendo.lee();
	}

}

class Leer_Fichero{
	public void lee() {
		try {
			entrada=new FileReader("C:/Users/Pibol/Desktop/ejemplo.txt");
			BufferedReader mibuffer=new BufferedReader(entrada);
			//int c=0;
			String linea="";
			/*while(c!=-1) {
				c=entrada.read();
				char letra=(char)c;
				System.out.print(letra);
			}*/
			while(linea!=null) {
				linea=mibuffer.readLine();
				if(linea!=null) {
					System.out.println(linea);
				}		
			}
		} catch (IOException e) {
			System.out.println("No se ha encontrado el fichero");
		} finally {
			try {
				entrada.close();
			} catch (IOException e) {
				System.out.println("No se ha encontrado el fichero");
			}
		}
	}
	FileReader entrada;
}
