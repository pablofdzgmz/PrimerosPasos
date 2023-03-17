package BBDD_JDBC.conectaBD;
import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. CREAR CONEXION
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			//2. CREAR OBJETO STATEMENT
			Statement miStatement=miConexion.createStatement();
			//3. EJECUTAR SQL
			ResultSet miResultset=miStatement.executeQuery("SELECT * from productos");
			//4. RECORRE EL RESULTSET
			while(miResultset.next()) {
				System.out.println(miResultset.getString("ID")+" "+miResultset.getString("Tipo")+" "+miResultset.getString("Marca")+" "+miResultset.getString("Descripcion"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
