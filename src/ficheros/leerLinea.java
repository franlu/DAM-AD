/**
 * 
 */
package fichero;

import java.io.*;

/**
 * @author franlu
 *
 */
public class leerLinea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			File f = new File("datos\java.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linea;
			while((linea = br.readLine()) != null)
				System.out.println(linea);
			
			br.close();
		}
		catch (FileNotFoundException fn) {
			System.out.println("El fichero no se encuentra...");
		}
		
		catch (IOException io) {
			System.out.println("Error de E/S");
		}

	}

}
