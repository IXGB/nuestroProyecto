package logico;

import java.util.ArrayList;

public class HistorialClinico {
	
	ArrayList<Consulta> misConsultas;
	ArrayList<Vacuna> misVacunas;
	ArrayList<Enfermedad> misEnfermedades;
	
	public HistorialClinico(ArrayList<Consulta> misConsultas, ArrayList<Vacuna> misVacunas,
			ArrayList<Enfermedad> misEnfermedades) {
		super();
		this.misConsultas = misConsultas;
		this.misVacunas = misVacunas;
		this.misEnfermedades = misEnfermedades;
	}

	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}

	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}

	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}
	
}
