# Conectores a BD (JDBC)

### Drivers

- [MySQL](https://www.mysql.com/products/connector/)
- [SQLite](https://github.com/xerial/sqlite-jdbc)

### Alojamiento gratuito MySQL - PhpMyAdmin

- [db4free](https://www.db4free.net/)

### Ejemplos

1. [MySQL](https://github.com/franlu/DAM-AD/tree/master/conectores/ConnMySQL.java)
2. [DataBaseMetaData](https://github.com/franlu/DAM-AD/tree/master/conectores/Databasemetadata.java)
3. [ResultSetMetaData](https://github.com/franlu/DAM-AD/tree/master/conectores/Resultsetmetadata.java)

**Métodos del objeto Statement**

- **executeQuery(String):** Recuperar datos de un único objeto ResulSet. Principalmente bajo la sentencia SELECT
- **executeUpdate(String):** Se utiliza para sentencias INSERT, UPDATE, DELETE, CREATE, DROP, ALTER. Devuelve el número de filas afectadas y para las sentencias DDL devuelve 0.
- **execute(String):** Se pude usar para cualquier sentencia. Devuelve true si devuelve un ResulSet (getResultSet) y false si devuelve un recuento de filas (getUpdateCount)

4. [Execute](https://github.com/franlu/DAM-AD/tree/master/conectores/Execute.java)
5. [ExecuteUpdate](https://github.com/franlu/DAM-AD/tree/master/conectores/ExecuteUpdate.java)
6. [Vista](https://github.com/franlu/DAM-AD/tree/master/conectores/CrearVista.java)
7. [Sentencia Preparada](https://github.com/franlu/DAM-AD/tree/master/conectores/SentenciaPreparada.java)

### Ejercicio

1. Crea un programa que se conecte a una base de datos SQLite (local). El programa creará una tabla con 6 campos de diferentes tipos. Implementa métodos diferentes para realizar las operaciones básicas sobre una BD (CRUD).

2. Añade una interfaz gráfica al ejercicio anterior que permita visualizar cada campo de la tabla en función del ID de la tabla. De contener botones para insertar, eliminar y modificar un registro de la tabla. Un botón para salir y otro para limpiar los datos.
