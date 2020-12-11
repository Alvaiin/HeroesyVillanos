package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import heroesyvillanos.miscelaneos.Criterio;
import heroesyvillanos.supers.AdministradorSupers;
import heroesyvillanos.supers.Enfrentamiento;
import heroesyvillanos.supers.Liga;
import heroesyvillanos.supers.Personaje;

class EnfrentamientosTest {
	

	
	@Test
	void personajeVsPersonajeTest() {
		AdministradorSupers as = new AdministradorSupers();
		
		Personaje pj1 = as.crearPersonaje("Personaje1","pj1",100,70,33,60);
		Personaje pj2 = as.crearPersonaje("Personaje2","pj2",100,80,24,40);
		Criterio criterio1 = new Criterio("Resistencia");
		
		Enfrentamiento enfrentamiento1 = new Enfrentamiento(pj1,pj2,criterio1);
		
		assertTrue(enfrentamiento1.definirGanador() == pj1);
		
		List<String> criterios = new ArrayList<String>();
		criterios.add("Fuerza");
		criterios.add("Velocidad");
		Criterio criterio2 = new Criterio(criterios);
		
		Enfrentamiento enfrentamiento2 = new Enfrentamiento(pj1,pj2,criterio2);
		assertTrue(enfrentamiento2.definirGanador() == pj2);
		
	}
	
	@Test
	void personajeVsLigaTest() {
		AdministradorSupers as = new AdministradorSupers();
		
		Personaje pj1 = as.crearPersonaje("Personaje1","pj1",100,70,33,60);
		Personaje pj2 = as.crearPersonaje("Personaje2","pj2",100,70,33,60);
		Personaje pj3 = as.crearPersonaje("Personaje3","pj3",100,70,33,60);
		Personaje pj4 = as.crearPersonaje("Personaje4","pj4",100,70,33,60);
		Personaje pj5 = as.crearPersonaje("Personaje5","pj5",99,70,33,60);
		
		Liga liga = new Liga("SuperLiga");
		liga.agregarMiembro(pj1);
		liga.agregarMiembro(pj2);
		liga.agregarMiembro(pj3);
		liga.agregarMiembro(pj4);
		
		Criterio criterio = new Criterio("Fuerza");
		
		Enfrentamiento enfrentamiento1 = new Enfrentamiento(pj5,liga,criterio);
		assertTrue(enfrentamiento1.definirGanador() == liga);
		
		Personaje pj6 = as.crearPersonaje("Personaje6","pj6",101,70,33,60);
		Enfrentamiento enfrentamiento2 = new Enfrentamiento(pj6,liga,criterio);
		assertTrue(enfrentamiento2.definirGanador() == pj6);
		
	}
	
	@Test
	void ligaVsLigaTest() {
		AdministradorSupers as = new AdministradorSupers();
		
		Personaje pj1 = as.crearPersonaje("Personaje1","pj1",100,70,33,60);
		Personaje pj2 = as.crearPersonaje("Personaje2","pj2",100,70,33,60);
		Personaje pj3 = as.crearPersonaje("Personaje3","pj3",100,70,33,60);
		Personaje pj4 = as.crearPersonaje("Personaje4","pj4",100,70,33,60);
		Personaje pj5 = as.crearPersonaje("Personaje5","pj5",99,70,33,60);
		
		Liga liga1 = new Liga("Liga1");
		liga1.agregarMiembro(pj1);
		liga1.agregarMiembro(pj2);
		liga1.agregarMiembro(pj3);
		
		Liga liga2 = new Liga("Liga2");
		liga2.agregarMiembro(pj4);
		liga2.agregarMiembro(pj5);
	
		
		Enfrentamiento enfrentamiento = new Enfrentamiento(liga1,liga2,new Criterio("Fuerza"));
		
		assertTrue(enfrentamiento.definirGanador() == liga1);
	}

}
