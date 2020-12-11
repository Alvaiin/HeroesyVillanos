package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Resistencia extends Caracteristica{

	public Resistencia() {
		super("Resistencia");
	}
	
	@Override
	public double getNivel(Personaje personaje) {
		Caracteristica fuerza = personaje.getCaracteristica("Fuerza");
		Caracteristica velocidad = personaje.getCaracteristica("Velocidad");
		return fuerza.getNivel(personaje)/velocidad.getNivel(personaje);
	}

}
