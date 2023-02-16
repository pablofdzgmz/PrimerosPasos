package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Layout marco=new Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		setTitle("Prueba acciones");
		setBounds(600,350,600,300);
		Panel_Layout lamina=new Panel_Layout();
		/*FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		lamina.setLayout(disposicion);*/
		//lamina.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50)); //alineamos y separamos por pix
		Panel_Layout2 lamina2=new Panel_Layout2();
		add(lamina,BorderLayout.NORTH);
		add(lamina2,BorderLayout.SOUTH);
	}
}

class Panel_Layout extends JPanel{
	public Panel_Layout() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
	}
}

class Panel_Layout2 extends JPanel{
	public Panel_Layout2() {
		setLayout(new BorderLayout());
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.CENTER);
		add(new JButton("Negro"), BorderLayout.EAST);
	}
	
}
