package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Invisibilidad extends Caracteristica {

	private double nivel;
	
	public Invisibilidad(double nivel) {
		super("Invisibilidad");
		this.nivel = nivel;
	}

	@Override
	public double getNivel(Personaje personaje) {
		return nivel;
	}


}
