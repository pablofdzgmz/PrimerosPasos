package Programacion_generica.clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado Administrativa=new Empleado("Elena", 45, 1500);
		Jefe DirectoraComercial=new Jefe("Ana", 27, 3500);
		Empleado nuevoEmpleado=DirectoraComercial;*/
		Pareja<Empleado> Administrativa=new Pareja<Empleado>();
		Pareja<Jefe> DirectoraComercial=new Pareja<Jefe>();
		//Pareja<Empleado> nuevoEmpleado=DirectoraComercial;
		Pareja.imprimirTrabajador(Administrativa);
		Pareja.imprimirTrabajador(DirectoraComercial);
	}

}
