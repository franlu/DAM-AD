package mysql;

import java.sql.*;

public class Execute {   
	
	public static void main(String[] args) throws 
	       ClassNotFoundException, SQLException {
	  
		//CONEXION A MYSQL  	       
	   Class.forName("com.mysql.jdbc.Driver");		 
	   Connection conexion = DriverManager.getConnection  
            ("jdbc:mysql://localhost/nombre_db","usuario", "clave");    		   
	   
	   String sql="SELECT * FROM departamentos";
	   Statement sentencia = conexion.createStatement();		   
	   boolean valor = sentencia.execute(sql);  
	   		   
	   if(valor){
	    	ResultSet rs = sentencia.getResultSet();
	   	 while (rs.next())
	   	    System.out.printf("%d, %s, %s %n",
	   	    		rs.getInt(1), rs.getString(2), rs.getString(3));
	    	rs.close();
	   } else {
	    	int f = sentencia.getUpdateCount();
	    	System.out.printf("Filas afectadas:%d %n", f);
	   }
	   
		sentencia.close();
		conexion.close();
	}//main
}//
