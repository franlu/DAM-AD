/**
 * Manipulacion de ficheros
 */
package ficheros;

// Clases para manejar la entrada/salida
import java.io.*;

/**
 * @author franlu
 *
 */
public class declaracion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f1 = new File("\\datos\\info.txt");

		System.out.println(f1.getParent());
		
		String dir = "\\datos";
		File directorio = new File(dir, "info1.txt");
	}

}
