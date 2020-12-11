package heroesyvillanos.supers.caracteristicas;
import heroesyvillanos.supers.Personaje;

public abstract class Caracteristica {
	private String nombre;
	
	public Caracteristica(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getNivel(Personaje personaje);
	
	public String getNombre() {
		return nombre;
	}
}
