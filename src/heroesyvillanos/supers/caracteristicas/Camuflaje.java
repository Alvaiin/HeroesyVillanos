package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Camuflaje extends Caracteristica {

	public Camuflaje() {
		super("Camuflaje");
	}

	@Override
	public double getNivel(Personaje personaje) {
		return personaje.getCaracteristica("Invisibilidad").getNivel(personaje) <
				personaje.getCaracteristica("Fuerza").getNivel(personaje)?
				50d:personaje.getCaracteristica("Velocidad").getNivel(personaje);
	}
	

}
