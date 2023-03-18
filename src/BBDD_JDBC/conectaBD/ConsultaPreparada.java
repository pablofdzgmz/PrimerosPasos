package BBDD_JDBC.conectaBD;
import java.sql.*;

public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. CREAR CONEXION
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			//2. PREPARAR CONSULTA
			PreparedStatement miSentencia=miConexion.prepareStatement("SELECT * FROM productos "
					+ "WHERE Tipo=? and Marca=?");
			//3. ESTABLECER PARAMETROS DE CONSULTA
			miSentencia.setString(1, "Cosmetico");
			miSentencia.setString(2, "Loreal");
			//4. EJECUTAR Y RECORRER CONSULTA
			ResultSet rs=miSentencia.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ID")+" "+rs.getString("Tipo")+" "+rs.getString("Marca")+" "+rs.getString("Descripcion"));
			}
			rs.close();
			//REUTILIZACION DE CONSULTA SQL
			System.out.println();
			System.out.println("EJECUCION SEGUNDA CONSULTA");
			System.out.println();
			//3. ESTABLECER PARAMETROS DE CONSULTA
			miSentencia.setString(1, "Cosmetico");
			miSentencia.setString(2, "Garnier");
			//4. EJECUTAR Y RECORRER CONSULTA
			rs=miSentencia.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ID")+" "+rs.getString("Tipo")+" "+rs.getString("Marca")+" "+rs.getString("Descripcion"));
			}
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
