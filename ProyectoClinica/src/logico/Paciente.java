package logico;

public class Paciente extends Persona {

	private String nhc;
	private HistorialClinico historial;
	private String tipoSangre;
	private float peso;
	private float estatura;
	private boolean curado;
	
	public Paciente(String nhc, String tipoSangre, float peso, float estatura, Persona miPersona) {
		super(miPersona.getCedula(),miPersona.getNombre(),miPersona.getTelefono(),miPersona.getDireccion(),miPersona.getSexo());
		this.nhc = nhc;
		this.historial = new HistorialClinico();
		this.tipoSangre = tipoSangre;
		this.peso = peso;
		this.estatura = estatura;
		this.setCurado(false);
	}
	
	public String getNHC() {
		return nhc;
	}

	public void setNHC(String nhc) {
		this.nhc = nhc;
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
	
	public boolean esSangreABPositivo()
	{
		if (this.tipoSangre.equalsIgnoreCase("AB+")) {
				return true;
		}
		return false;
	}
	
	public boolean esSangreABNegativo()
	{
		if (this.tipoSangre.equalsIgnoreCase("AB-")) {
				return true;
		}
		return false;
	}
	
	public boolean esSangreAPositivo()
	{
		if (this.tipoSangre.equalsIgnoreCase("A+")) {
				return true;
		}
		return false;
	}
	public boolean esSangreANegativo()
	{
		if (this.tipoSangre.equalsIgnoreCase("A-")) {
				return true;
		}
		return false;
	}
	public boolean esSangreBPositivo()
	{
		if (this.tipoSangre.equalsIgnoreCase("B+")) {
				return true;
		}
		return false;
	}
	public boolean esSangreBNegativo()
	{
		if (this.tipoSangre.equalsIgnoreCase("B-")) {
				return true;
		}
		return false;
	}
	public boolean esSangreOPositivo()
	{
		if (this.tipoSangre.equalsIgnoreCase("O+")) {
				return true;
		}
		return false;
	}public boolean esSangreONegativo()
	{
		if (this.tipoSangre.equalsIgnoreCase("O-")) {
				return true;
		}
		return false;
	}

	public boolean isCurado() {
		return curado;
	}

	public void setCurado(boolean curado) {
		this.curado = curado;
	}
	
}
