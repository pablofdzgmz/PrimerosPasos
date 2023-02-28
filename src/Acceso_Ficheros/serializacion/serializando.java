package Acceso_Ficheros.serializacion;
import java.util.*;
import java.io.*;

public class serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador jefe=new Administrador("Pablo", 80000, 2005,12,15);
		jefe.setIncentivo(5000);
		Empleado[] personal=new Empleado[3];
		personal[0]=jefe;
		personal[1]=new Empleado("Ana", 25000, 2008, 10, 1);
		personal[2]=new Empleado("Luis", 18000, 2012, 9 , 15);
		try {
			//ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/Pibol/Desktop/java_ser/empleado.dat"));
			//escribiendo_fichero.writeObject(personal);
			//escribiendo_fichero.close();
			ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/Pibol/Desktop/java_ser/empleado.dat"));
			Empleado[] personal_recuperado=(Empleado[]) recuperando_fichero.readObject();
			recuperando_fichero.close();
			for(Empleado e: personal_recuperado) { //"for each" bucle
				System.out.println(e);
			}
		}catch(Exception e) {
			
		}
	}
}
class Empleado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Empleado(String n, double s, int agno, int mes, int dia) {
		nombre=n;
		sueldos=s;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
		fechaContrato=calendario.getTime();
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldos;
	}
	public Date getFechaContrato() {
		return fechaContrato;
	}
	public void subirSueldo(double porcentaje) {
		double aumento=sueldos*porcentaje/100;
		sueldos=aumento;
	}
	public String toString() {
		return "Nombre = "+nombre+" Sueldo = "+sueldos+", Fecha de contrado = "+fechaContrato;
	}
	private String nombre;
	private double sueldos;
	private Date fechaContrato;
}
class Administrador extends Empleado{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Administrador(String n, double s, int agno, int mes, int dia) {
				super(n,s,agno,mes,dia);
		incentivo=0;
	}
	public double getSueldo() {
		double sueldoBase=super.getSueldo();
		return sueldoBase + incentivo;	
	}
	public void setIncentivo(double b) {
		incentivo=b;
	}
	public String toString() {
		return super.toString() + " Incentivo= " +incentivo;
	}
	private double incentivo;
}


