package heroesyvillanos.supers;
import java.util.HashMap;
import java.util.Map;

import heroesyvillanos.supers.caracteristicas.Caracteristica;

public class Personaje extends Super{

	private String nombreReal;
	private String superNombre;
	private Map<String, Caracteristica> caracteristicas;
	
	public Personaje(String nombreReal, String superNombre ) {
		this.nombreReal = nombreReal;
		this.superNombre = superNombre;
		this.caracteristicas = new HashMap<String, Caracteristica>();
	}
	
	String getNombreReal() {
		return this.nombreReal;
	}
	
	@Override
	public String getSuperNombre() {
		return this.superNombre;
	}
	
	public void agregarCaracteristica(Caracteristica caracteristica) {
		caracteristicas.put(caracteristica.getNombre(), caracteristica);
	}

	public Caracteristica getCaracteristica(String caracteristica) {
		return caracteristicas.get(caracteristica);
	}

	@Override
	public double getNivelDeCaracteristica(String caracteristica) {			
		return this.caracteristicas.get(caracteristica).getNivel(this);
	}

	@Override
	public String toString() {
		return "Personaje [superNombre=" + superNombre + "]";
	}

}
