package logico;

import java.util.ArrayList;

public class HistorialClinico {
	
	ArrayList<Consulta> misConsultas;
	ArrayList<Vacuna> misVacunas;
	ArrayList<Enfermedad> misEnfermedades;
	
	public HistorialClinico() {
		super();
		this.misConsultas = new ArrayList<>();
		this.misVacunas = new ArrayList<>();
		this.misEnfermedades = new ArrayList<>();
	}

	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}


	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}
	
	public void insertarVacuna(Vacuna vacuna) {
		misVacunas.add(vacuna);
	}
	
	public void insertarConsulta(Consulta consulta) {
		misConsultas.add(consulta);
	}
	
	public void insertarEnfermedad(Enfermedad enfermedad) {
		misEnfermedades.add(enfermedad);
	}
	
	public boolean estaCurado() {
		if(this.misEnfermedades.size()>0)
		{
			return false;
		}
		return true;
	}
	
}
