package logico;

public class Vacuna {

	private String lote;
	private String nombre;
	private Enfermedad enfermedad;
	private int cant;
	
	public Vacuna(String lote, String nombre, Enfermedad enfermedad, int cant) {
		super();
		this.lote = lote;
		this.nombre = nombre;
		this.enfermedad = enfermedad;
		this.cant = cant;
	}
	
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
}
