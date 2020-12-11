package heroesyvillanos.miscelaneos;

import java.util.LinkedList;
import java.util.List;

public class Criterio {
	
	List<String> caracteristicas;
	
	public Criterio(String caracteristica) {
		this.caracteristicas = new LinkedList<String>();
		this.caracteristicas.add(caracteristica);
	}
	
	public Criterio(List<String> caracteristicas) {
		this.caracteristicas = new LinkedList<String>();
		this.caracteristicas.addAll(caracteristicas);
	}
	
	public List<String> getCriterios(){
		return this.caracteristicas;
	}
}
