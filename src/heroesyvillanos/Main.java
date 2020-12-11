package heroesyvillanos;


import java.util.ArrayList;
import java.util.List;

import heroesyvillanos.miscelaneos.Criterio;
import heroesyvillanos.supers.AdministradorSupers;
import heroesyvillanos.supers.Enfrentamiento;
import heroesyvillanos.supers.Liga;
import heroesyvillanos.supers.Personaje;
import heroesyvillanos.supers.Super;

public class Main {

	public static void main(String[] args) {
		
		AdministradorSupers as = new AdministradorSupers();
		
		Personaje pj1 = as.crearPersonaje("Personaje1","pj1",101,80,24,40);
		Personaje pj2 = as.crearPersonaje("Personaje2","pj2",100,90,24,40);
		Personaje pj3 = as.crearPersonaje("Personaje3","pj3",100,80,24,40);
		Personaje pj4 = as.crearPersonaje("Personaje4","pj4",99,80,24,40);
		Personaje pj5 = as.crearPersonaje("Personaje5","pj5",98,80,24,40);
		Personaje pj6 = as.crearPersonaje("Personaje6","pj6",102,80,24,40);
		
		
		//Poder armar ligas de súper héroes o súper villanos
		Liga liga1 = as.crearLiga("Liga1");
		
		liga1.agregarMiembro(pj1);
		liga1.agregarMiembro(pj2);
		
		//Todos los personajes/ligas que existen en el juego que venzan a un personaje dado para un cierto criterio.
		
		List<Super> vencen = as.vencenA(pj3, new Criterio("Fuerza"));

		System.out.println(vencen);

		
		//Decidir quién es el vencedor de una disputa, acorde a un criterio.
		
		List<String> criterios = new ArrayList<String>();
		criterios.add("Fuerza");
		criterios.add("Velocidad");
		Criterio criterio = new Criterio(criterios);
		
		Enfrentamiento enfrentamiento = new Enfrentamiento(pj3,pj2,criterio);
		
		System.out.println(pj3.getSuperNombre() + " vs "+pj2.getSuperNombre() + " - Ganador: "+enfrentamiento.definirGanador().getSuperNombre());
		
		//Obtener listados de personajes ordenadospor múltiples criterios
		List<Personaje> personajes = as.ordernarPor(criterio,true);
		
		System.out.println(personajes);
		
		
	}
	
	
}
