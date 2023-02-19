package graficos;
import java.awt.*;
import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		FrameSpinner mimarco=new FrameSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class FrameSpinner extends JFrame{
	public FrameSpinner() {
		setBounds(550,350,550,350);
		setVisible(true);
		add(new LaminaSpinner());
	}
}
class LaminaSpinner extends JPanel{
	public LaminaSpinner() {
		//String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//JSpinner control=new JSpinner(new SpinnerListModel(lista));
		JSpinner control=new JSpinner(new MiModeloJSpinner());
		Dimension d=new Dimension(200,20);
		control.setPreferredSize(d);
		add(control);
	}
	private class MiModeloJSpinner extends SpinnerNumberModel{
		public MiModeloJSpinner() {
			super(5,0,10,1);
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
}
