package BBDD_JDBC.modelo;
import java.sql.*;
import BBDD_JDBC.controlador.Conexion;

public class CargaSecciones {
	public CargaSecciones() {
		miConexion=new Conexion();
	}
	public String ejecutaConsultas() {
		Productos miProducto=null;
		Connection accesoBBDD=miConexion.dameConexion();
		try {
			Statement secciones=accesoBBDD.createStatement();
			rs=secciones.executeQuery("SELECT DISTINCTROW Seccion FROM productos");
			while(rs.next()) {
				miProducto=new Productos();
				miProducto.setSeccion(rs.getString(1));
				return miProducto.getSeccion();
			}
			rs.close();
		}catch(Exception e) {
			
		}
		return miProducto.getSeccion();
	}
	Conexion miConexion;
	public ResultSet rs;
}
