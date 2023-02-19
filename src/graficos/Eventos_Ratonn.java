package graficos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Ratonn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRatonn marcoo=new MarcoRatonn();
		marcoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRatonn extends JFrame{
	public MarcoRatonn() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRatonn EventoRatonn=new EventosDeRatonn();
		addMouseMotionListener(EventoRatonn);
	}
}

class EventosDeRatonn implements MouseMotionListener{

	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo");
	}
	
}