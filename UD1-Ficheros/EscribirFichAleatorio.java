package ficheros;
/**
 * 
 */

import java.io.*;
/**
 * @author franlu
 *
 */
public class EscribirFichAleatorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("Empleados.dat");
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		String apellido[] = {"GIL","GOMEZ","MANGAS"};
		int departamento[] = {10,20,30};
		Double salario[] = {1000.50, 2000.23, 950.80};
		
		StringBuffer sbuf = null;
		int n = apellido.length;
		
		for(int i=0; i<n; i++) {
			raf.write(i+1);
			
			sbuf = new StringBuffer(apellido[i]);
			sbuf.setLength(10);
			
			raf.writeChars(sbuf.toString());
			raf.writeInt(departamento[i]);
			raf.writeDouble(salario[i]);
		}
		raf.close();
	}

}
