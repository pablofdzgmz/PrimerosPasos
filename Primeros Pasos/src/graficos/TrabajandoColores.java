package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor mimarco=new MarcoConColor();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConColor extends JFrame{
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColor miLamina=new LaminaConColor();
		add(miLamina);
		//miLamina.setBackground(SystemColor.window); //poner color por defecto del SO al panel
		//miLamina.setBackground(Color.BLUE); //poner color de fondo al panel
	}	
}

class LaminaConColor extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		//dibujo rectangulo
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		g2.draw(rectangulo);
		//dibujo elipse
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		//color rgb
		g2.setPaint(new Color(200,140,255).brighter()); //brighter añade brillo
		g2.fill(elipse);

	}
}