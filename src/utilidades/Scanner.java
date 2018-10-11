/**
 * 
 */
package utilidades;

/**
 * @author @franlu
 *
 */
public class Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println ("Empezamos el programa");
        System.out.println ("Por favor introduzca una cadena por teclado:");

        String entradaTeclado = "";

        //Creación de un objeto Scanner
        Scanner entradaEscaner = new Scanner (System.in); 
        
        //Invocamos un método sobre un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); 

        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");

	}

}
