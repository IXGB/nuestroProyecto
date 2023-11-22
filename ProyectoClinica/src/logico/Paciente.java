package logico;

public class Paciente extends Persona {

	private String NHC;
	private HistorialClinico historial;
	private String tipoSangre;
	private float peso;
	private float estatura;
	
	public Paciente(String cedula, String nombre, String telefono, String direccion, String sexo, String NHC, HistorialClinico historial, String tipoSangre, float peso, float estatura) {
		super(cedula, nombre, telefono, direccion, sexo);
		this.NHC = NHC;
		this.historial = historial;
		this.tipoSangre = tipoSangre;
		this.peso = peso;
		this.estatura = estatura;
		
	}

	public String getNHC() {
		return NHC;
	}

	public void setNHC(String nHC) {
		NHC = nHC;
	}

	public HistorialClinico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialClinico historial) {
		this.historial = historial;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	
	
}
