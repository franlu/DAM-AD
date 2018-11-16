package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CrearVista {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/nombre_db","usuario", "clave");

		StringBuilder sql = new StringBuilder();
        sql.append("CREATE OR REPLACE VIEW totales ");
        sql.append("(dep, dnombre, nemp, media) AS ");
        sql.append("SELECT d.dept_no, dnombre, COUNT(emp_no), AVG(salario) ");
        sql.append("FROM departamentos d LEFT JOIN empleados e " );
        sql.append("ON e.dept_no = d.dept_no ");
        sql.append("GROUP BY d.dept_no, dnombre ");
		System.out.println(sql);
		
		Statement sentencia = conexion.createStatement();
		int filas = sentencia.executeUpdate(sql.toString());
		System.out.printf("Resultado  de la ejecuci�n: %d %n", filas);

		sentencia.close();
		conexion.close(); 

	}
}
