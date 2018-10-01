/**
 * 
 */
package ficheros;

import java.io.*;

/**
 * @author franlu
 *
 */
public class informacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Información sobre el fichero");
		File f = new File("\\src\\ficheros\\datos\\info.txt");
		
		if (f.exists()){
			System.out.println("Nombre del fichero        : " + f.getName());
			System.out.println("Ruta                      : " + f.getPath());
			System.out.println("Ruta absoluta             : " + f.getAbsolutePath());
			System.out.println("Se puede leer             : " + f.canRead());
			System.out.println("Se puede escribir         : " + f.canWrite());
			System.out.println("Tamaño                    : " + f.length());
			System.out.println("Es un directorio          : " + f.isDirectory());
			System.out.println("Es un fichero             : " + f.isFile());
			System.out.println("Nombre de directorio padre: " + f.getParent());
		}

	}

}
