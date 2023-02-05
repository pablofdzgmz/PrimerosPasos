package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos mimarco=new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba con dibujos");
		setSize(400,400);
		LaminaConFiguras miLamina=new LaminaConFiguras();
		add(miLamina);
	}	
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200); //dibuja rectangulo
		//g.drawLine(100, 100, 300, 200); //dibuja linea
		//g.drawArc(50, 100, 100, 200, 120, 150); //dibuja arco
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangulo);
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100,100,300,250));
		double CentroenX=rectangulo.getCenterX();
		double CentroenY=rectangulo.getCenterY();
		double radio=150;
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		g2.draw(circulo);
	}
}