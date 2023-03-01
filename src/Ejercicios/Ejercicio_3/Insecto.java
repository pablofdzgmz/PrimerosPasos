package Ejercicios.Ejercicio_3;

class Insecto extends Animal {
	
	public Insecto() {
		
	}
	
	public Insecto(String nombre, char sexo, int anioNacimiento,
			  	   boolean vertebrado, boolean volador, int numPatas) {
		super(nombre,sexo,anioNacimiento,vertebrado);
		this.volador=volador;
		this.numPatas=numPatas;
	}
	private boolean volador;
	private int numPatas;
	
	public void setVolador(boolean volador) {
		this.volador=volador;
	}
	public boolean getVolador() {
		return volador;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas=numPatas;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void asignarFactorEdad() {
		
	}
	public String toString() {
		return "Datos del insecto: \n"
				+ "Nombre: "+ nombre + "\n"
				+ "Sexo: "+ sexo + "\n"
				+ "Año de nacimiento: "+ anioNacimiento + "\n"
				+ "Vertebrado: "+ vertebrado + "\n"
				+ "Volador: "+ volador + "\n"
				+ "Nº de patas: " + numPatas + "\n"
				+ "La edad humana del insecto son: "+ edadHumana + "\n";				
	}
}
