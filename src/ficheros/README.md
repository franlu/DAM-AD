# Paquete ficheros

Ejemplos utilizando las clases asociadas a la manipulaciÃ³n de ficheros y directorios

- File, FileReader, FileWritter, BufferedReader, BufferedWriter

1. [Declaración](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/declaracion.java)
    Ejemplo de declaración de un fichero.
2. [Información](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/informacion.java)
    Muestra la información de un fichero.
3. [leerCaracter]()
	Lee los caracteres, uno a uno, que contiene un fichero de texto.
3. [escribirCaracter]()
    Escribe caracteres, uno a uno, en un fichero de texto.
3. [leerLinea](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/leerLinea.java)
	Lee las lineas completas que contiene un fichero de texto.
3. [escribirLinea](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/escribirLinea.java)
    Escriber lineas completas en un fichero de texto.
7. [leerEscribirBytes](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/leerEscribirBytes.java)
    Escribe y lee datos sobre un fichero binario.
8. [datosPrimitivos](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/datosPrimitivos.java)
    Escribe y lee datos primitivos sobre un fichero binario.
    
    
    
    
### Ejercicios

- Crea un programa en Java que copie el contenido de un fichero de texto en un fichero de texto vacio. La ruta a los fichero se introducira mendiante teclado.
- Crea un programa en Java que escriba en un fichero de bytes una lista de nombres y edades, utilizando la clase *DataOutputStream*.
- Crea un programa en Java que lea de un fichero de bytes una lista de nombres y edades, debe enviar la lectura a la salida estandar. Utilizando la clase *DataOutputStream*.

- Crear la clase *MovimientoBancario* con los siguientes atributos: fecha, concepto, cantidad, tipo. Escribir constructor, getters y setters. Estos datos corresponden a los movimientos de una cuenta corriente. Solicitar al usuario cinco movimientos (usando MovimientoBancario) y almacenarlos en un fichero llamado *movimientos.dat* dentro de una carpeta del proyecto llamada datos. A continuación leer del fichero las cantidades y mosstrar un mensaje con el saldo actual de la cuenta. El atributo tipo es Boolean. En caso de ser true se estará indicando un ingreso, en caso contrario se retira dinero de la cuenta.
