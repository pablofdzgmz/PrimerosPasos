package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora mimarco=new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		LaminaCalculadora milamina=new LaminaCalculadora();
		add(milamina);
		//pack();
	}
}

class LaminaCalculadora extends JPanel{
	public LaminaCalculadora() {
		principio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		milamina2=new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		ActionListener insertar=new InsertaNumero();
		ActionListener orden=new AccionOrden();
		ponerBoton("7",insertar);ponerBoton("8",insertar);ponerBoton("9",insertar);ponerBoton("/",orden);
		ponerBoton("4",insertar);ponerBoton("5",insertar);ponerBoton("6",insertar);ponerBoton("*",orden);
		ponerBoton("1",insertar);ponerBoton("2",insertar);ponerBoton("3",insertar);ponerBoton("-",orden);
		ponerBoton("0",insertar);ponerBoton(".",insertar);ponerBoton("=",orden);ponerBoton("+",orden);
		add(milamina2, BorderLayout.CENTER);
		ultimaoperacion="=";
	}	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
	}
	private class InsertaNumero implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String entrada=e.getActionCommand();
			if(principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText() +entrada);			
		}	
	}
	private class AccionOrden implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operacion=e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaoperacion=operacion;
			principio=true;
		}
		public void calcular(double x) {
			if(ultimaoperacion.equals("+")) {
				resultado+=x;
			}else if(ultimaoperacion.equals("-")) {
				resultado-=x;
			}else if(ultimaoperacion.equals("*")) {
				resultado*=x;
			}else if(ultimaoperacion.equals("/")) {
				resultado/=x;
			}else if(ultimaoperacion.equals("=")) {
				resultado=x;
			}
			pantalla.setText(""+resultado);
		}
		
	}
	JButton pantalla;
	private JPanel milamina2;
	private boolean principio;
	private double resultado;
	private String ultimaoperacion;
}