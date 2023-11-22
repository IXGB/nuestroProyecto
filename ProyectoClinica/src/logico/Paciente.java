package logico;

public class Paciente extends Persona {

	private String NHC;
	private HistorialClinico historial;
	private String tipoSangre;
	private float peso;
	private float estatura;
	
	public Paciente(String cedula, String nombre, String telefono, String direccion, String sexo, String NHC, HistorialClinico historial, String tipoSangre, float peso, float estatura) {
		super(id, cedula, nombre, telefono, direccion, sexo);
		this.NHC = NHC;
		this.historial = historial;
		this.tipoSangre = tipoSangre;
		this.peso = peso;
		this.estatura = estatura;
		
	}

	
	
}
