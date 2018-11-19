/**
 * 
 */
package manipulacion;

/**
 * @author franlu
 *
 */

import java.io.*;

public class leerEscribirBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		int i;
		File f = new File("datos\bytes.dat");
		FileOutputStream fileout = new FileOutputStream(f);
		FileInputStream filein = new FileInputStream(f);
       
		for (i=0; i<100; i++)
			fileout.write(i);
		
		fileout.close();
		
		while ((i = filein.read()) != -1)
			System.out.println(i);
		
		filein.close();
	}

}
