import java.sql.*;

public class InsertaDepPreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/nombre_db","usuario", "clave");
										
			// recuperar argumentos de main
			String dep = args[0]; // num. departamento
			String dnombre = args[1]; // nombre
			String loc = args[2]; // localidad
			
			// construir orden INSERT
			String sql = "INSERT INTO departamentos VALUES "
					+ "( ?, ?, ? )";
		    
			System.out.println(sql);  			    
			PreparedStatement sentencia = 
					conexion.prepareStatement(sql);				
			sentencia.setInt(1, Integer.parseInt(dep));
			sentencia.setString(2, dnombre);
			sentencia.setString(3, loc);
			
			int filas;//
			try {
			  filas = sentencia.executeUpdate();
			  System.out.println("Filas afectadas: " + filas);
			} catch (SQLException e) {
				System.out.println("HA OCURRIDO UNA EXCEPCIÓN:"); 
			    System.out.println("Mensaje:    "+ e.getMessage()); 
			    System.out.println("SQL estado: "+ e.getSQLState()); 
		    	System.out.println("Código error:  "+ e.getErrorCode());  
			}
			
			sentencia.close();
			conexion.close();

		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
