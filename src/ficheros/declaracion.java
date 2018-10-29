/**
 * Manipulacion de ficheros
 */
package fichero;

// Clases para manejar la entrada/salida
import java.io.*;
import java.util.Scanner;

/**
 * @author franlu
 *
 */
public class declaracion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 System.out.println ("Empezamos el programa");

	        System.out.println ("Por favor introduzca una cadena por teclado:");

	        String entradaTeclado = "";

	        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

	        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
		
		/**File f1 = new File("\\datos\\info.txt");

		System.out.println(f1.getParent());
		
		String dir = "\\datos";
		File directorio = new File(dir, "info1.txt");*/
	}

}
