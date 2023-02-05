package graficos;
import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco=new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		mimarco.setBounds(300,300,500,350);
		mimarco2.setBounds(900,300,500,350);
	}
}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(oyente_ventana);
	}
}

class M_Ventana implements WindowListener{
	public void windowActivated(WindowEvent e) { //cuando se reactiva
		System.out.println("Ventana activada");
	}
	public void windowClosed(WindowEvent e) { //cuando se cierra ventana sin acabar programa
		System.out.println("La ventana ha sido cerrada");
	}
	public void windowClosing(WindowEvent e) { //cuando se cierra ventana
		System.out.println("Cerrando ventana");
	} 
	public void windowDeactivated(WindowEvent e) { //cuando se desactiva
		System.out.println("Ventana desactivada");
	}
	public void windowDeiconified(WindowEvent e) { //cuando se restaura
		System.out.println("Ventana restaurada");
	}
	public void windowIconified(WindowEvent e) { //cuando minimiza pantalla.
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e) { //cuando se abre ventana
		System.out.println("Ventana abierta");
	}
}