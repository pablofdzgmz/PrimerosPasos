package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1=new Empleados("Tito Puente");
		Empleados trabajador2=new Empleados("Pol Anka");
		Empleados trabajador3=new Empleados("Krusty the Clown");
		Empleados trabajador4=new Empleados("Sideshow Bob");
		trabajador1.cambiaSeccion("Producción");
		/*trabajador1.cambiaNombre("Maria");*/
		System.out.println(trabajador1.devuelveDatos() + "\n" +
		trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n"+
		trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());

	}

}


class Empleados{
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;	
	}
	
	/*public void cambiaNombre(String nombre) {
		this.nombre=nombre;
	}*/
	
	public String devuelveDatos() {
		return "El nombre es: " +nombre+ " y el id es " +Id+" y la seccion es: "+seccion;
	}
	
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
}