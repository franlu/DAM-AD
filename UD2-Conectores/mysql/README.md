# MySQL

### Conexión

1. [MySQL](mysql/ConnMySQL.java)
2. [DataBaseMetaData](mysql/Databasemetadata.java)
3. [ResultSetMetaData](mysql/Resultsetmetadata.java)

### Métodos del objeto Statement

- **executeQuery(String):** Recuperar datos de un único objeto ResulSet. Principalmente bajo la sentencia SELECT
- **executeUpdate(String):** Se utiliza para sentencias INSERT, UPDATE, DELETE, CREATE, DROP, ALTER. Devuelve el número de filas afectadas y para las sentencias DDL devuelve 0.
- **execute(String):** Se pude usar para cualquier sentencia. Devuelve true si devuelve un ResulSet (getResultSet) y false si devuelve un recuento de filas (getUpdateCount)

4. [Execute](mysql/Execute.java)
5. [ExecuteUpdate](mysql/ExecuteUpdate.java)
6. [Vista](mysql/CrearVista.java)
7. [Sentencia Preparada](mysql/SentenciaPreparada.java)

### Declaración de llamadas a procedimientos y funciones

	- {call nombre_procedimiento}: sin parámetros
	- { ? = call nombre_funcion}: devuelve un valor
	- {call nombre_procedimiento(?,?,...)}: recibe parámetros
	- {? = nombre_funcion(?,?,...)}: devuelve un valor (primer parámetro) y recibe varios parámetros

8. [Procedimiento](mysql/Procedimiento.java)

### Transacciones

[Canal makigas](https://www.youtube.com/channel/UCQufRmIMRTLdRxTsXCh4-5w) 
- [Transacciones, commits y rollbacks (parte 1)](https://www.youtube.com/watch?v=oDo8Kr9YqE8)
- [Transacciones, commits y rollbacks (parte 2)](https://www.youtube.com/watch?v=v4EBceRzDUE)

![Esquema](images/transacciones_jdbc.png)


### Ejercicio

1. Crea un programa que se conecte a una base de datos SQLite (local). El programa creará una tabla con 6 campos de diferentes tipos. Implementa métodos diferentes para realizar las operaciones básicas sobre una BD (CRUD).

2. Añade una interfaz gráfica al ejercicio anterior que permita visualizar cada campo de la tabla en función del ID de la tabla. De contener botones para insertar, eliminar y modificar un registro de la tabla. Un botón para salir y otro para limpiar los datos.

### Práctica

1. Crea un DB en db4free con las sentencias que aparecen en el fichero [dpto_empleados](mysql/sql/dpto_empleados.sql)

2. Visualiza el número y nombre de todos los departamentos.
3. Modificar el nombre de un departamento cuyo número (y nombre) se pasen como argumento. No utilizar sentencias preparadas. Visualizar el número de filas afectadas.
4. Realiza el ejercicio anterior con sentencias preparadas.
5. Crea una clase para acceso a la base de datos *empleados* con los siguientes
métodos. Controlar errores y utilizar sentencias preparadas:
	- Conectar a la base de datos (carga del driver y establecimiento de conexión).
	- Insertar un departamento. El método recibirá tres argumentos (número, nombre y localidad).
	- El mismo que el anterior pero recibiendo un solo argumento, un objeto de la clase departamento. Será necesario por 		tanto crear una clase departamento, con sus atributos y métodos getter y setter.
	- Método que devuelva un ArrayList de objetos departamento ante la consulta de todas las columnas de todos los 	departamentos de la tabla dept
	- Método que reciba un número de departamento y devuelva sus datos mediante un objeto.
	- Método que reciba un objeto departamento y actualice la tabla dept.
	- Método que reciba un número de departamento y lo dé de baja.
	- Ídem del anterior pero devolviendo el número de filas afectadas.
	- Método que reciba un número de departamento y actualice su localidad (segundo argumento del método). Utilizar el siguiente procedimiento:
	```
	delimiter //
	CREATE PROCEDURE actualizaDept(cod INT(2), localidad VARCHAR(13))
	BEGIN
	UPDATE Dept SET loc=localidad WHERE deptno = cod;
	END;
	//
```
