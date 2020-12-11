package heroesyvillanos.supers;

import java.util.Iterator;

import heroesyvillanos.miscelaneos.Criterio;

public class Enfrentamiento {
	
	private Super competidor1;
	private Super competidor2;
	private Criterio criterio;
	
	public Enfrentamiento(Super competidor1, Super competidor2, Criterio criterio) {
		this.competidor1 = competidor1;
		this.competidor2 = competidor2;
		this.criterio = criterio;
	}
	
	public Super definirGanador() {
		Iterator<String> criterios = criterio.getCriterios().iterator();

		while(criterios.hasNext()) {
			String criterio = criterios.next();
			double resultado = competidor1.getNivelDeCaracteristica(criterio) - competidor2.getNivelDeCaracteristica(criterio);
			if(resultado != 0) {
				return resultado>0?competidor1:competidor2;
			}
		}
		
		return null;
	}

}
