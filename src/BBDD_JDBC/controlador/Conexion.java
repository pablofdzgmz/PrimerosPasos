package BBDD_JDBC.controlador;
import java.sql.*;

public class Conexion {
	Connection miConexion=null;
	public Conexion() {
		
	}
	public Connection dameConexion() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return miConexion;
		
	}
}
