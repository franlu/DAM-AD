import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 */

/**
 * @author franlu
 *
 */
public class LeerFichAleatorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		File f = new File("Empleados.dat");
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		
		int id, dpto, posicion;
		Double salario;
		char apellido[] = new char[10], aux;
		String apellidos;
		
		posicion = 0; 
		
		for(;;) {
			raf.seek(posicion);
			id = raf.readInt();
			
			for(int i=0; i<apellido.length; i++){
				aux = raf.readChar();
				apellido[i] = aux;
				
			}
			
			apellidos = new String(apellido);
			dpto = raf.readInt();
			salario = raf.readDouble();
			
			if(id > 0)
				System.out.printf("ID: %s, Apellido: %s, Departamento: %d,"
						+ "	Salario: %.2f %n",
						id, apellidos.trim(), dpto, salario);
			
			posicion = posicion + 36;
			
			if (raf.getFilePointer() == raf.length()) break;
		}
		
		raf.close();

	}

}
