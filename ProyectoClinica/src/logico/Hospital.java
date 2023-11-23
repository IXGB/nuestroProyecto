package logico;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Persona>misPersonas;
	private ArrayList<HistorialClinico>misHistoriales;
	private ArrayList<Enfermedad>misEnfermedades;
	private static Hospital elHospital=null;
	
	public Hospital() {
		super();
		this.misPersonas = new ArrayList<Persona>();
		this.misHistoriales = new ArrayList<HistorialClinico>();
		this.misEnfermedades = new ArrayList<Enfermedad>();
	}
	
	public static Hospital getInstance() {
		if(elHospital==null) {
			elHospital= new Hospital();
		}
		return elHospital;
	}
	
	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	public ArrayList<HistorialClinico> getMisHistoriales() {
		return misHistoriales;
	}

	public void setMisHistoriales(ArrayList<HistorialClinico> misHistoriales) {
		this.misHistoriales = misHistoriales;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}
	
	public void annadirPaciente(Paciente unPaciente) {
		misPersonas.add(unPaciente);
	}
}
