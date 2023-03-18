package BBDD_JDBC.conectaBD;
import java.sql.*;

public class ModificaBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. CREAR CONEXION
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			//2. CREAR OBJETO STATEMENT
			Statement miStatement=miConexion.createStatement();
			//INSERTAR
			//String instruccionSql="INSERT INTO productos (ID, Tipo, Marca, Descripcion) VALUES ('5','Cosmetico','Nivea','Crema Hidratante')";
			//MODIFICAR
			//String instruccionSql="UPDATE productos SET descripcion='Crema reafirmante' where ID='5'";
			//BORRAR
			String instruccionSql="DELETE FROM productos where ID=5";
			miStatement.executeUpdate(instruccionSql);
			System.out.println("Datos insertados correctamente");
		}catch(Exception e) {
			System.out.println("¿NO CONECTA!");
			System.out.println(e.getMessage());
		}
	}

}
