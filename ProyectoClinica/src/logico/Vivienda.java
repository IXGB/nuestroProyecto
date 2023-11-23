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
	

}
