package logico;

public class Doctor extends Persona {

	private String especializacion;
	private String id;
	
	public Doctor(String id, String cedula, String nombre, String telefono, String direccion, String sexo, String id, String especiaclizacion) {
		super(id, cedula, nombre, telefono, direccion, sexo);
		this.id = id;
		this.especializacion = especializacion;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	
}
