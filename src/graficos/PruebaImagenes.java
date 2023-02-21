package graficos;
import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco Con Imagen");
		setBounds(750,300,300,200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		File miimagen=new File("src/graficos/esfera.jpg");
		try {
		imagen=ImageIO.read(miimagen);
		}
		catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*File miimagen=new File("src/main.java.graficos/coche.jpg");
		try {
		imagen=ImageIO.read(miimagen);
		}
		catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		g.drawImage(imagen, 5, 5, null);*/
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for(int i=0;i<300;i++) {
			for(int j=0;j<200;j++) {
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j); //copiar imagen (posicionx, posiciony, tamañow imagen, tamañoy imagen, coordenadax a pegar, coordenaday a pegar
			}
		}
		
	}
	
	private Image imagen;
}
