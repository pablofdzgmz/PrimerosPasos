package graficos;

import java.awt.event.*;

import javax.swing.*;

public class Eventos_Ventanaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		MarcoVentanaa mimarco=new MarcoVentanaa();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		MarcoVentanaa mimarco2=new MarcoVentanaa();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		mimarco.setBounds(300,300,500,350);
		mimarco2.setBounds(900,300,500,350);
	}
}

class MarcoVentanaa extends JFrame{
	public MarcoVentanaa() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		//M_Ventanaa oyente_ventana=new M_Ventanaa();
		//addWindowListener(oyente_ventana);
		addWindowListener(new M_Ventanaa());
	}
}

class M_Ventanaa extends WindowAdapter{ //Asi no es necesario poner todos los metodos de ventana
	public void windowIconified(WindowEvent e) { //cuando minimiza pantalla.
		System.out.println("Ventana minimizada");
	}
}