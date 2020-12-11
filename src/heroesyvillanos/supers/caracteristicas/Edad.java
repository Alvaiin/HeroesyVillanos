package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Edad extends Caracteristica {

	int nivel;
	
	public Edad(int nivel) {
		super("Edad");
		this.nivel = nivel;
	}
	@Override
	public double getNivel(Personaje personaje) {
		return nivel;
	}

}
