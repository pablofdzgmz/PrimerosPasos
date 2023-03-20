package BBDD_JDBC.conectaBD;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Aplicacion_Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mimarco=new Marco_Aplicacion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class Marco_Aplicacion extends JFrame{
	public Marco_Aplicacion() {
		setTitle("Consulta BBDD");
		setBounds(500,300,400,400);
		setLayout(new BorderLayout());
		JPanel menus=new JPanel();
		menus.setLayout(new FlowLayout());
		secciones=new JComboBox();
		secciones.addItem("Todos");
		paises=new JComboBox();
		paises.setEditable(false);
		paises.addItem("Todos");
		resultado=new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		menus.add(secciones);
		menus.add(paises);
		add(menus, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta=new JButton("Consulta");
		botonConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ejecutaConsulta();
			}	
		});
		add(botonConsulta, BorderLayout.SOUTH);
		
		//--------------CONEXION CON BBDD-------------------	
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			Statement sentencia=miConexion.createStatement();
			// CARGA JCOMBOBOX SECCIONES
			String consulta="SELECT DISTINCTROW Seccion from Productos";
			ResultSet rs=sentencia.executeQuery(consulta);
			while(rs.next()) {
				secciones.addItem(rs.getNString(1));
			}
			rs.close();
			// CARGA JCOMBOBOX PAISES
			String consulta2="SELECT DISTINCTROW PaisdeOrigen from Productos";
			ResultSet rs2=sentencia.executeQuery(consulta2);
			while(rs2.next()) {
				paises.addItem(rs2.getNString(1));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	private void ejecutaConsulta() {
		ResultSet rs3=null;
		try {
			resultado.setText("");
			String seccion=(String)secciones.getSelectedItem();
			String pais=(String)paises.getSelectedItem();
			if(!seccion.equals("Todos") && pais.equals("Todos")) {
				enviaConsultaSeccion=miConexion.prepareStatement(consultaSeccion);
				enviaConsultaSeccion.setString(1, seccion);
				rs3=enviaConsultaSeccion.executeQuery();
			}else if(seccion.equals("Todos") && !pais.equals("Todos")) {
				enviaConsultaPais=miConexion.prepareStatement(consultaPaises);
				enviaConsultaPais.setString(1, pais);
				rs3=enviaConsultaPais.executeQuery();
			}else if(!seccion.equals("Todos") && !pais.equals("Todos")) {
				enviaConsultaTodo=miConexion.prepareStatement(consultaTodo);
				enviaConsultaTodo.setString(1, seccion);
				enviaConsultaTodo.setString(2, pais);
				rs3=enviaConsultaTodo.executeQuery();
			}
			while(rs3.next()) {
				resultado.append(rs3.getString(1));
				resultado.append(", ");
				resultado.append(rs3.getString(2));
				resultado.append(", ");
				resultado.append(rs3.getString(3));
				resultado.append(", ");
				resultado.append(rs3.getString(4));
				resultado.append("\n");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	private PreparedStatement enviaConsultaSeccion, enviaConsultaPais, enviaConsultaTodo;
	private final String consultaSeccion="SELECT Tipo,Marca,Seccion,PaisdeOrigen FROM productos where Seccion=?";
	private final String consultaPaises="SELECT Tipo,Marca,Seccion,PaisdeOrigen FROM productos where PaisdeOrigen=?";
	private final String consultaTodo="SELECT Tipo,Marca,Seccion,PaisdeOrigen FROM productos where Seccion=? and PaisdeOrigen=?";
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;
	private Connection miConexion;
}