### Ejercicios

- Crea un programa en Java que copie el contenido de un fichero de texto en un fichero de texto vacio. La ruta a los fichero se introducira mendiante teclado.
- Crea un programa en Java que escriba en un fichero de bytes una lista de nombres y edades, utilizando la clase *DataOutputStream*.
- Crea un programa en Java que lea de un fichero de bytes una lista de nombres y edades, debe enviar la lectura a la salida estandar. Utilizando la clase *DataOutputStream*.

- Crear la clase *MovimientoBancario* con los siguientes atributos: fecha, concepto, cantidad, tipo. Escribir constructor, getters y setters. Estos datos corresponden a los movimientos de una cuenta corriente. Solicitar al usuario cinco movimientos (usando MovimientoBancario) y almacenarlos en un fichero llamado *movimientos.dat* dentro de una carpeta del proyecto llamada datos. A continuación leer del fichero las cantidades y mosstrar un mensaje con el saldo actual de la cuenta. El atributo tipo es Boolean. En caso de ser true se estará indicando un ingreso, en caso contrario se retira dinero de la cuenta.

### Ejercicio Ficheros Aleatorios

Necesitamos una aplicación para gestionar una lista de reproducción de nuestras canciones favoritas. Esta lista se debe almacenara en un fichero de acceso aleatorio(archivo de bytes). Para cada canción se almacenan los siguientes datos: ID, Año, Título, Artista, Album, Duración.

Se han de crear dos clases. Una clase para representar la lista de reproducción y otra clase para crea un menú de opciones sobre la lista.

- La primera opción se utiliza para crea un fichero, el nombre del fichero será: listaReproduccion.dat

- La segunda opción debe consultar los datos de una cancion del fichero aleatorio. Se solicitara a través de teclado un identificador de la canción. Si el ID existe se visualizaran los datos correspondientes en caso contrario se mostrara un mensaje de error.

- Tercera opción, recibe por teclado los datos de una canción e inserta en el fichero dicha información. Primero ha de comprobar si existe el ID de la canción, antes de insertar los nuevos datos. Si existe se informa al usuario.

- Cuarta opción, se recibe el ID y el año (por ejemplo, puede ser otro campo) de la canción. Se debe modificar el año de la canción. El programa debe visualizar el nombre de la canción, el año anterior y el nuevo año. Si el ID no existe, se informa al usuario.

- Quinta opción, se recibe el ID de una canción y borra su información. Se hará un borrado lógico: el ID será igual a -1, el resto de datos tendran un valor igual a cero o a la cadena vacía. En uno de los campos se debe almacenar el ID de la canción que se ha borrado.

- Por último, se deben mostrar los IDs de las canciones borradas.
