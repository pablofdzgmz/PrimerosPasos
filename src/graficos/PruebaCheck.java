package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaCheck {

	public static void main(String[] args) {
		MarcoCheckk mimarcoo=new MarcoCheckk();
		mimarcoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheckk extends JFrame{
	public MarcoCheckk() {
		setBounds(500,300,550,350);
		setVisible(true);
		LaminaCheckk milamina=new LaminaCheckk();
		add(milamina);
	}
}
class LaminaCheckk extends JPanel{
	public LaminaCheckk() {
		setLayout(new BorderLayout());
		Font miletra=new Font("Arial", Font.PLAIN, 24);
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(miletra);
		JPanel laminatexto=new JPanel();
		laminatexto.add(texto);
		add(laminatexto, BorderLayout.CENTER);
		check1=new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel laminacheckss=new JPanel();
		laminacheckss.add(check1);
		laminacheckss.add(check2);
		add(laminacheckss, BorderLayout.SOUTH);
	}
	private class ManejaChecks implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int tipo=0;
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			texto.setFont(new Font("Serif",tipo,24));
		}	
	}
	private JLabel texto;
	private JCheckBox check1, check2;
}