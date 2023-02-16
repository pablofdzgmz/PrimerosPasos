package graficos;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders mimarco=new Frame_Sliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Frame_Sliders extends JFrame{
	public Frame_Sliders() {
		setBounds(550,400,550,350);
		Lamina_Sliders milamina=new Lamina_Sliders();
		add(milamina);
		setVisible(true);
	}
}
class Lamina_Sliders extends JPanel{
	public Lamina_Sliders() {
		/*JSlider control=new JSlider(0,100,50);
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setFont(new Font("Serif", Font.BOLD, 10)); //fuente
		control.setPaintLabels(true); //texto
		control.setSnapToTicks(true); //salta a la mas cercana
		control.setPaintTicks(true); //barritas
		add(control);*/
		setLayout(new BorderLayout());
		rotulo=new JLabel("En un lugar de la Mancha...");
		add(rotulo, BorderLayout.CENTER);
		control=new JSlider(8,50,12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		control.addChangeListener(new EventoSlider());
		JPanel laminaSlider=new JPanel();
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);
	}
	private class EventoSlider implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			rotulo.setFont(new Font("Serif", Font.ITALIC, control.getValue()));
		}
	}
	private JLabel rotulo;
	private JSlider control;
	//private static int contador;
}