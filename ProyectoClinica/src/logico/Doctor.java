package logico;

public class Doctor extends Persona {

	private String especializacion;
	
	public Doctor(String id, String cedula, String nombre, String telefono, String direccion, String sexo) {
		super(id, cedula, nombre, telefono, direccion, sexo);
		
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	
}
