package Ejercicios.Ejercicio_3;

class Pez extends Animal{

	public Pez() {
		
	}
	
	public Pez(String nombre, char sexo, int anioNacimiento,
			   boolean vertebrado, String tipoAgua) {
		super(nombre,sexo,anioNacimiento,vertebrado);
		this.tipoAgua=tipoAgua;
	}
	private String tipoAgua;
	
	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua=tipoAgua;
	}
	public String getTipoAgua() {
		return tipoAgua;
	}
	public void asignarFactorEdad() {
		
	}
	public String toString() {
		return "Datos del insecto: \n "
				+ "Nombre: "+ nombre + "\n "
				+ "Sexo: "+ sexo + "\n "
				+ "Año de nacimiento: "+ anioNacimiento + "\n "
				+ "Vertebrado: "+ vertebrado + "\n "
				+ "Tipo de agua: " +tipoAgua + "\n "
				+ "La edad humana del insecto son: "+ edadHumana + "\n ";				
	}
}
