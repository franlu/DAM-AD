package xml;
import java.io.*;
import com.thoughtworks.xstream.XStream;

public class EscribirPersonas {
  
	public static void main(String[] args)
          throws IOException, ClassNotFoundException {   	
    
		File fichero = new File("personas.dat");
   		FileInputStream filein = new 
               FileInputStream(fichero);//flujo de entrada   
    
		//conecta el flujo de bytes al flujo de datos
    	ObjectInputStream dataIS = new ObjectInputStream(filein);      
    
		System.out.println
           ("Comienza el proceso de creaci�n del fichero a XML ...");
				
    //Creamos un objeto Lista de Personas
    ListaPersonas listaper = new ListaPersonas();	 
     
    try {
      while (true) { //lectura del fichero
          //leer una Persona
	    Persona persona= (Persona) dataIS.readObject();    
	    listaper.add(persona); //a�adir persona a la lista  
      }	
    }catch (EOFException eo) {}
    
    dataIS.close();  //cerrar stream de entrada     
    
    try {
		XStream xstream = new XStream();   
		//cambiar de nombre a las etiquetas XML
		xstream.alias("ListaPersonasMunicipio", 
                                            ListaPersonas.class);	
		xstream.alias("DatosPersona", Persona.class);
		
		//xstream.aliasField("Nombre alumno", Persona.class, "nombre");
		//xstream.aliasField("Edad alumno", Persona.class, "edad");
		
		//quitar etiqueta lista (atributo de la claseListaPersonas)
		xstream.addImplicitCollection
                          (ListaPersonas.class, "lista");
		//Insertar los objetos en el XML
	      xstream.toXML(listaper, new
                          FileOutputStream("Personas.xml"));	
		System.out.println("Creado fichero XML....");
	
     }catch (Exception e) 
	   {e.printStackTrace();}	    
  } // fin main
} //fin EscribirPersonas

