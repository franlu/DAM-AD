# Manejo de ficheros XML

Interfaces para usar DOM

- **Document:** Objeto equivalente a un documento XML.
- **Element:** Objeto equivalente a un elemento del documento XML.
- **Node:** Representa cualquier nodo del documento.
- **NodeList:** Lista con los nodos hijos de un nodo.
- **Attr:** Permite acceder a los atributos de un nodo.
- **Text:** Son los datos carácter de un elemento.
- **CharacterData:** Atributos y métodos para manipular los datos de caracteres.
- **DocumentType:** Información de la etiqueta DOCTYPE.

Empleado
- [Crear y escribir](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/CrearEmpleadoXml.java)
- [Leer](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/LecturaEmpleadoXml.java)

**Actividad:**
Crear un documento XML partiendo del fichero que contiene información sobre las canciones (lista de reproducción). Mostrar el contenido del documento por consola.
	
Acceso a ficheros XML con SAX
- [Ejemplo](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/PruebaSax1.java)

**Actividad:**
Utiliza SAX para visualizar el contendio del fichero XML que contiene información sobre canciones.	

Serialización de objetos
- [Crear Lista de personas](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/ListaPersonas.java)
- [Escribir Personas](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/EscribirPersonas.java)
- [Leer Personas](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/LeerPersonas.java)

**Actividad:**
Serializar los objetos canción a un fichero XML.
	
Conversión a otros formatos
- [Conversor](https://github.com/franlu/DAM-AD/blob/master/ficheros/xml/convertidor.java)

**Actividad:**
Crea una plantilla para convertir el fichero xml de canciones en un fichero html. Realiza la conversión.
