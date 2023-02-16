package graficos;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.text.*;

public class Procesador_III {

	public static void main(String[] args) {
		MenuProcesador_III mimarco=new MenuProcesador_III();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MenuProcesador_III extends JFrame{
	public MenuProcesador_III() {
		setBounds(500,300,550,400);
		LaminaProcesador_III milamina=new LaminaProcesador_III();
		add(milamina);
		setVisible(true);
	}
}
class LaminaProcesador_III extends JPanel{
	public LaminaProcesador_III() {
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//----------GERMAN----------------		
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamagno=new JMenu("Tamaño");
		configura_menu("Arial","fuente","Arial",9,10,"bin/graficos/esfera.jpg");
		configura_menu("Courier","fuente","Courier",9,10,"");
		configura_menu("Verdana","fuente","Verdana",9,10,"");
		//---------PABLO---------------------	
		configura_menu("Negrita","estilo","",Font.BOLD,1,"bin/graficos/esfera.jpg");
		configura_menu("Cursiva","estilo","",Font.ITALIC,1,"bin/graficos/esfera.jpg");	
		//------------------------------------
		configura_menu("12","tamaño","",9,12,"");
		configura_menu("16","tamaño","",9,16,"");		
		configura_menu("20","tamaño","",9,20,"");
		configura_menu("24","tamaño","",9,24,"");
		//------------------------------------
		
		/*//----------Fuente------------------
		JMenuItem arial=new JMenuItem("Arial");
		JMenuItem courier=new JMenuItem("Courier");
		Gestiona_menus tipoletra=new Gestiona_menus();
		courier.addActionListener(tipoletra);
		//courier.addActionListener(new Gestiona_menus()); //Otra opcion mas simple
		JMenuItem verdana=new JMenuItem("Verdana");
		fuente.add(arial);fuente.add(courier);fuente.add(verdana);
		//----------Estilo------------------
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		estilo.add(negrita);estilo.add(cursiva);
		//----------Fuente------------------
		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam16=new JMenuItem("16");
		JMenuItem tam20=new JMenuItem("20");
		JMenuItem tam24=new JMenuItem("24");
		tamagno.add(tam12);tamagno.add(tam16);tamagno.add(tam20);tamagno.add(tam24);
		//----------------------------------*/
		mibarra.add(fuente);mibarra.add(estilo);mibarra.add(tamagno);
		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);
		miarea=new JTextPane();
		add(miarea, BorderLayout.CENTER);
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
		}else if(menu=="estilo") {
			estilo.add(elem_menu);
			if(estilos==Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}else if(menu=="tamaño") {
			tamagno.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
		}
	}	
	JTextPane miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
}