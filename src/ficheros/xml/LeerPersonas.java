package ficheros.xml;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;

public class LeerPersonas {
  public static void main(String[] args) throws IOException {   	
	
    XStream xstream = new XStream();
	
    xstream.alias("ListaPersonasMunicipio", ListaPersonas.class);		
    xstream.alias("DatosPersona", Persona.class);	
    xstream.addImplicitCollection(ListaPersonas.class, "lista");
	
    ListaPersonas listadoTodas = (ListaPersonas) 
         xstream.fromXML(new FileInputStream("Personas.xml"));			
    System.out.println("Numero de Personas: " + 
         listadoTodas.getListaPersonas().size());
			       
    List<Persona> listaPersonas = new ArrayList<Persona>();
	listaPersonas = listadoTodas.getListaPersonas();
			        
    Iterator iterador = listaPersonas.listIterator(); 
    while( iterador.hasNext() ) {
	    Persona p = (Persona) iterador.next(); 
	    System.out.printf("Nombre: %s, edad: %d %n", 
                          p.getNombre(), p.getEdad());        
    }    
    System.out.println("Fin de listado .....");
 } //fin main
}//fin LeerPersonas
