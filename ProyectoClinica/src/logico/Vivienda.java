package logico;

import java.util.ArrayList;

public class Vivienda {

	private ArrayList<Persona> misPersonas;

	public Vivienda() {
		super();
		this.misPersonas = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	public void insertarPersona(Persona miPersona) {
		misPersonas.add(miPersona);
	}

	public ArrayList<Persona> getLosHombres() {
		ArrayList<Persona> losHombres = new ArrayList<>();
		for (Persona miPersona : misPersonas) {
			if(miPersona.esMasculino()) {
				losHombres.add(miPersona);
			}
		}
		return losHombres;
	}

	public ArrayList<Persona> getLasMujeres() {
		ArrayList<Persona> lasMujeres = new ArrayList<>();
		for (Persona miPersona : misPersonas) {
			if(miPersona.esFemenino()) {
				lasMujeres.add(miPersona);
			}
		}
		return lasMujeres;
	}
	
}
