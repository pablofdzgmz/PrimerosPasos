package BBDD_JDBC.controlador;
import java.awt.event.*;
import java.util.ResourceBundle.Control;

import BBDD_JDBC.modelo.CargaSecciones;
import BBDD_JDBC.vista.Marco_Aplicacion2;

public class ControladorCargaSecciones extends WindowAdapter {
	public ControladorCargaSecciones(Marco_Aplicacion2 elmarco) {
		this.elmarco=elmarco;
	}
	public void windowOpened(WindowEvent e) {
		obj.ejecutaConsultas();
		try {
			while(obj.rs.next()) {
				elmarco.secciones.addItem(obj.rs.getString(1));
			}
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	CargaSecciones obj=new CargaSecciones();
	private Marco_Aplicacion2 elmarco;
}
