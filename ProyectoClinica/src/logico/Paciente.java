package logico;

public class Paciente extends Persona {

	private String nHC;
	private HistorialClinico historial;
	private String tipoSangre;
	private float peso;
	private float estatura;
	
	public Paciente(String nHC, String tipoSangre, float peso, float estatura, Persona miPersona) {
		super(miPersona.getCedula(),miPersona.getNombre(),miPersona.getTelefono(),miPersona.getDireccion(),miPersona.getSexo());
		this.nHC = nHC;
		this.historial = new HistorialClinico();
		this.tipoSangre = tipoSangre;
		this.peso = peso;
		this.estatura = estatura;
	}
	
	public String getNHC() {
		return nHC;
	}

	public void setNHC(String nHC) {
		this.nHC = nHC;
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
