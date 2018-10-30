/**
 * 
 */
package ficheros;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author franlu
 *
 */
public class datosPrimitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		File f = new File("datos/primitivos.dat");
		FileOutputStream fileout = new FileOutputStream(f);
		DataOutputStream dataOS = new DataOutputStream(fileout);
		
		dataOS.writeUTF("Cadena");
		dataOS.writeInt(69);
		dataOS.writeDouble(2.35);
		dataOS.writeBoolean(false);
		
		dataOS.close();

	}

}
