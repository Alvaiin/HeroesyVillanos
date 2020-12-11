package heroesyvillanos.supers;

import java.util.ArrayList;
import java.util.List;

public class Liga extends Super {

	private String nombre;
	private List<Personaje> miembros;
	
	public Liga(String nombre) {
		this.nombre = nombre;
		miembros = new ArrayList<Personaje>();
	}
	
	public void agregarMiembro(Personaje personaje) {
		if(!miembros.contains(personaje))
			miembros.add(personaje);
	}
	
	public void agregarMiembro(Liga liga) {
		if(liga == this)
			return;
		for (Personaje personaje : liga.getMiembros()) {
			if(!miembros.contains(personaje))
				miembros.add(personaje);
		}
	}
	
	@Override
	public double getNivelDeCaracteristica(String caracteristica) {
		double promedio = 0;
		for (Personaje personaje : miembros) {
			promedio += personaje.getNivelDeCaracteristica(caracteristica)/miembros.size();
		}
		return promedio;
	}

	@Override
	public String getSuperNombre() {
		return this.nombre;
	}
	
	public List<Personaje> getMiembros(){
		return this.miembros;
	}

}
