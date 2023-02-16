package graficos;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.*;

public class Procesador_IV {

	public static void main(String[] args) {
		MenuProcesador_IV mimarco=new MenuProcesador_IV();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MenuProcesador_IV extends JFrame{
	public MenuProcesador_IV() {
		setBounds(500,300,550,400);
		LaminaProcesador_IV milamina=new LaminaProcesador_IV();
		add(milamina);
		setVisible(true);
		setTitle("Procesador IV");
	}
}
class LaminaProcesador_IV extends JPanel{
	public LaminaProcesador_IV() {
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//-----------------------------------		
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamagno=new JMenu("Tamaño");
		configura_menu("Arial","fuente","Arial",9,10,"");
		configura_menu("Courier","fuente","Courier",9,10,"");
		configura_menu("Verdana","fuente","Verdana",9,10,"");
		//-------------CheckBox-----------------	
		JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new ImageIcon("bin/graficos/esfera.jpg"));
		JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new ImageIcon("bin/graficos/esfera.jpg"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);estilo.add(cursiva);
		//configura_menu("Negrita","estilo","",Font.BOLD,1,"bin/graficos/esfera.jpg");
		//configura_menu("Cursiva","estilo","",Font.ITALIC,1,"bin/graficos/esfera.jpg")	
		//-------------Radio Button----------------
		ButtonGroup tamagno_letra=new ButtonGroup();
		JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		tamagno_letra.add(doce);tamagno_letra.add(dieciseis);
		tamagno_letra.add(veinte);tamagno_letra.add(veinticuatro);
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",20));
		//veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",24));
		tamagno.add(doce);tamagno.add(dieciseis);tamagno.add(veinte);tamagno.add(veinticuatro);
		//configura_menu("12","tamaño","",9,12,"");
		//configura_menu("16","tamaño","",9,16,"");		
		//configura_menu("20","tamaño","",9,20,"");
		//configura_menu("24","tamaño","",9,24,"");
		//--------------------------------------------
		mibarra.add(fuente);mibarra.add(estilo);mibarra.add(tamagno);
		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);
		miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);
		//------------Menu Emergente------------------
		JPopupMenu emergente=new JPopupMenu();
		JMenuItem negritaE=new JMenuItem("Negrita");
		JMenuItem cursivaE=new JMenuItem("Cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);emergente.add(cursivaE);
		miarea.setComponentPopupMenu(emergente);
	}
	public void configura_menu(String rotulo, String menu, String tipo_letra,
							   int estilos, int tam, String ruta_icono) {
		JMenuItem elem_menu=new JMenuItem(rotulo,new ImageIcon(ruta_icono));
		if(menu=="fuente") {
			fuente.add(elem_menu);
			if(tipo_letra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			}else if(tipo_letra=="Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			}else if(tipo_letra=="Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}
		}
	}	
	JTextPane miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
}