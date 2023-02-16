package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton marco=new MarcoRaton();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRaton EventoRaton=new EventosDeRaton();
		addMouseListener(EventoRaton);
	}
}

class EventosDeRaton extends MouseAdapter{ //para la opcion mouse que elijas
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("Has hecho click");
		//System.out.println("Coordenada X: " +e.getX() + " Coordenada Y: " +e.getY());
		System.out.println(e.getClickCount());
	}*/
	public void mousePressed(MouseEvent e) {
		if(e.getModifiersEx()==1024) { //1024 boton izq raton
			System.out.println("Has pulsado el boton izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");			
		}
	}
}

/*class EventosDeRaton implements MouseListener{ //para todas las opciones mouse

	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir");
	}
	
}*/