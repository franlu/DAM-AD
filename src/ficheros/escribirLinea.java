/**
 * 
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * @author franlu
 *
 */
public class escribirLinea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
					
			File f = new File("datos\java.txt");
			FileWritter fr = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(fr);
			
			int nLineas = 10;
			for(i=1; i<=nLineas; i++) {
				br.write("Fila número: " + i);
				br.newLine();			
			}
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
