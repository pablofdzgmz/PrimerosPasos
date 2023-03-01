package Ejercicios.Ejercicio_3;

abstract class Animal {
	
	public Animal() {

	}
	
	public Animal(String nombre, char sexo, int anioNacimiento,
				  boolean vertebrado) {
		this.nombre=nombre;
		this.sexo=sexo;
		this.anioNacimiento=anioNacimiento;
		this.vertebrado=vertebrado;
	}
	
	public String nombre;
	public char sexo;
	public int anioNacimiento;
	public boolean vertebrado;
	public float factorEdad;
	public float edadHumana;
	public abstract void asignarFactorEdad();
	public String getNombre() {
		return nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public boolean getVertebrado() {
		return vertebrado;
	}
	public float getFactorEdad() {
		return factorEdad;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento=anioNacimiento;
	}
	public void setVertebrado(boolean vertebrado) {
		this.vertebrado=vertebrado;
	}
	public void setFactorEdad(float factorEdad) {
		this.factorEdad=factorEdad;
	}
	public float calcularEdadHumana() {
		
		return edadHumana;
	}
}
