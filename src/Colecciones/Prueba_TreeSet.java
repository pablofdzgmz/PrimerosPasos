package Colecciones;
import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		for(String s: ordenaPersonas) {
			System.out.println(s);
		}*/
		Articulo primero=new Articulo(1,"Primer articulo");
		Articulo segundo=new Articulo(2,"Segundo articulo");
		Articulo tercero=new Articulo(3,"Tercer articulo");
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		for(Articulo art: ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		//Articulo comparadorArticulos=new Articulo();
		//TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);
		//ComparadorArticulos compara_art=new ComparadorArticulos();
		//TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(compara_art);
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
				String descripcionA=o1.getDescripcion();
				String descripcionB=o2.getDescripcion();
				return descripcionA.compareTo(descripcionB);
			}
		});
		ordenaArticulos2.add(tercero);
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		for(Articulo art: ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		}
	}
	
	
}

/*class Articulo implements Comparable<Articulo>, Comparator<Articulo>{

	public Articulo() {
		
	}*/
class Articulo implements Comparable<Articulo>{
	
	public Articulo(int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
	}
	
	public int compareTo(Articulo o) {
		return numero_articulo - o.numero_articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	private int numero_articulo;
	private String descripcion;

	/*public int compare(Articulo o1, Articulo o2) {
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}*/
}

/*class ComparadorArticulos implements Comparator<Articulo>{

	public int compare(Articulo o1, Articulo o2) {
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
	
}*/
