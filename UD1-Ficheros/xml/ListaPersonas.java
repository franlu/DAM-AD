package xml;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	
    private List<Persona> lista = new ArrayList<Persona>();
    
    public ListaPersonas(){    	
    }

    public void add(Persona p) {
            lista.add(p);
    }
   
   public List<Persona> getListaPersonas() {
            return lista;
    }
}
