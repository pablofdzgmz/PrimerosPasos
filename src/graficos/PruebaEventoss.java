/*package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco=new MarcoBotones();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoBotones extends JFrame{	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LaminaBotones milamina=new LaminaBotones();
		add(milamina);	
	}
}

class LaminaBotones extends JPanel{	
	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
	public LaminaBotones() {
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		ColorFondo Azul=new ColorFondo(Color.blue);
		ColorFondo Rojo=new ColorFondo(Color.red);
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
	}

	private class ColorFondo implements ActionListener{
		public ColorFondo(Color c) {
			colorDeFondo=c;
		}
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		private Color colorDeFondo;
	}
}*/