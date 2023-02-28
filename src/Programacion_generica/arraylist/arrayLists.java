package Programacion_generica.arraylist;

public class arrayLists {

	public arrayLists(int z) {
		datosElemento=new Object[z];
	}
	public Object get(int i) {
		return datosElemento[i];
	}
	public void add(Object o) {
		datosElemento[i]=o;
		i++;
	}
	private Object[] datosElemento;
	private int i=0;

}
