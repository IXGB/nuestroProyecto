package logico;

public class Enfermedad {
	private String id;
	private String nombre;
	private String[] sintomas;
	private String[] precauciones;
	private boolean vigilancia;

	public Enfermedad(String id, String nombre, String[] sintomas, String[] precauciones, boolean vigilancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.precauciones = precauciones;
		this.vigilancia = vigilancia;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getSintomas() {
		return sintomas;
	}
	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}
	public String[] getPrecauciones() {
		return precauciones;
	}
	public void setPrecauciones(String[] precauciones) {
		this.precauciones = precauciones;
	}
	public boolean isVigilancia() {
		return vigilancia;
	}
	public void setVigilancia(boolean vigilancia) {
		this.vigilancia = vigilancia;
	}
	
	
}
