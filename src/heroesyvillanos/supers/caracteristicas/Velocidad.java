package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public class Velocidad extends Caracteristica {

	private int nivel;
	
	public Velocidad(int nivel) {
		super("Velocidad");
		this.nivel = nivel;
	}
	
	@Override
	public double getNivel(Personaje personaje) {
		return nivel;
	}

}
