package heroesyvillanos.supers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import heroesyvillanos.miscelaneos.Criterio;
import heroesyvillanos.supers.caracteristicas.Camuflaje;
import heroesyvillanos.supers.caracteristicas.Edad;
import heroesyvillanos.supers.caracteristicas.Fuerza;
import heroesyvillanos.supers.caracteristicas.Invisibilidad;
import heroesyvillanos.supers.caracteristicas.Resistencia;
import heroesyvillanos.supers.caracteristicas.Velocidad;

public class AdministradorSupers {

	List<Personaje> personajes;
	List<Liga> ligas;
	
	public AdministradorSupers() {
		this.personajes = new LinkedList<Personaje>();
		this.ligas = new LinkedList<Liga>();
	}
	
	public List<Personaje> ordernarPor(Criterio criterio, Boolean descendente){
		List<String> criterios = criterio.getCriterios();
		if(criterios.isEmpty())//criterios esta vacio
			return null;  
		personajes.sort(new Comparator<Personaje>() {

			@Override
			public int compare(Personaje p1, Personaje p2) {
				double resultado;
				for (String c : criterios) {
					resultado = descendente?
							p2.getNivelDeCaracteristica(c) - p1.getNivelDeCaracteristica(c):
							p1.getNivelDeCaracteristica(c) - p2.getNivelDeCaracteristica(c);
					if(resultado != 0)
						return resultado>0?1:-1;
				}
				return 0;
			}
		});	
		
		return personajes;
	}
	
	public Personaje crearPersonaje(String nombreReal, String nombreFalso, int fuerza, int velocidad, int edad, int invisibilidad) {
		Personaje pj = new Personaje(nombreReal,nombreFalso);
		pj.agregarCaracteristica(new Fuerza(fuerza));
		pj.agregarCaracteristica(new Velocidad(velocidad));
		pj.agregarCaracteristica(new Edad(edad));
		pj.agregarCaracteristica(new Invisibilidad(invisibilidad));
		pj.agregarCaracteristica(new Resistencia());
		pj.agregarCaracteristica(new Camuflaje());
		personajes.add(pj);
		return pj;
	}
	
	public Liga crearLiga(String nombre) {
		Liga liga = new Liga(nombre);
		this.ligas.add(liga);
		return liga;
	}
	
	public List<Super> vencenA(Personaje personaje, Criterio criterio){
		List<Super> vencedores = new ArrayList<Super>();
		for (Super s : this.personajes) {
			Enfrentamiento enfrentamiento = new Enfrentamiento(personaje,s,criterio);
			if(enfrentamiento.definirGanador() == s)
				vencedores.add(s);
		}
		
		for (Super s : this.ligas) {
			Enfrentamiento enfrentamiento = new Enfrentamiento(personaje,s,criterio);
			if(enfrentamiento.definirGanador() == s)
				vencedores.add(s);
		}
		return vencedores;
	}
	
	
	
}
