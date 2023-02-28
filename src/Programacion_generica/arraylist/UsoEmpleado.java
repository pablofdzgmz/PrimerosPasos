package Programacion_generica.arraylist;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado listaEmpleados[]=new Empleado[3];
		listaEmpleados[0]=new Empleado("Ana", 45, 2500);
		listaEmpleados[1]=new Empleado("Antonio", 55, 2000);
		listaEmpleados[2]=new Empleado("Maria", 25, 2600);*/
		ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
		//listaEmpleados.ensureCapacity(11); // Fija tamaño array
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Peter", 25, 2500));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Peter", 25, 2500));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		//listaEmpleados.trimToSize(); //Corta el tamaño innecesario del array
		listaEmpleados.set(1,new Empleado("PESUES", 25, 2600)); //set introduce un valor en una posicion determinada
		System.out.println(listaEmpleados.get(1).dameDatos()); //ver una posicion del array determinada
		for(Empleado e: listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
		while(mi_iterador.hasNext()){
			System.out.println(mi_iterador.next().dameDatos());
		}
		/*for(int i=0;i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
	}
}

class Empleado{
	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " +edad+ " años. Y un salario de " +salario;
	}
	private String nombre;
	private int edad;
	private double salario;
}
