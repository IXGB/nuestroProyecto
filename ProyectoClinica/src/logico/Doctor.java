package logico;

public class Doctor extends Persona {

	private String especializacion;
	private String id;
	
	public Doctor(String cedula, String nombre, String telefono, String direccion, String sexo, String id, String especiaclizacion) {
		super(cedula, nombre, telefono, direccion, sexo);
		this.setId(id);
		this.setEspecializacion(especiaclizacion); 
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
