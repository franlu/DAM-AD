/**
 * 
 */
package prueba;
import java.io.*;
/**
 * @author franlu
 *
 */
public class Pruebecilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f1 = new File("C:\\hola.txt");
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		f1.getParent();
	}

}
