package Programacion_generica.arraylist;
import java.io.*;
import java.util.ArrayList;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayLists archivos=new arrayLists(5);
		archivos.add("Juan");
		archivos.add("Maria");
		archivos.add("Ana");
		archivos.add("Sandra");
		archivos.add(new File("gestion_Pedidos.accdb"));
		String nombrePersona=(String)archivos.get(4);
		System.out.println(nombrePersona);
	}

}
