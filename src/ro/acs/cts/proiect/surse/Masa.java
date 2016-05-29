package ro.acs.cts.proiect.surse;

import java.util.ArrayList;
import java.util.List;

public class Masa {
	private int id;
	private List<Comanda> comenzi = new ArrayList<Comanda>();
	
	public Masa(int id){
		this.id = id;
	}
	
	public void adaugaComanda(Comanda comanda){
		comenzi.add(comanda);
	}
	
}
