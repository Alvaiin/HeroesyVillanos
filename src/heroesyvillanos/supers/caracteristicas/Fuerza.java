package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Fuerza extends Caracteristica {

	private double nivel;
	public Fuerza(int nivel) {
		super("Fuerza");
		this.nivel = nivel;
	}
	
	@Override
	public double getNivel(Personaje personaje) {
		return nivel;
	}

}
