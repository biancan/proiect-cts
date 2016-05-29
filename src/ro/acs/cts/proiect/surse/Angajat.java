package ro.acs.cts.proiect.surse;

import java.util.ArrayList;
import java.util.List;

public class Angajat {
	private String nume;
	private int salariu;
	List<Angajat> subordonati;
	List<Masa> mese;
	
	public Angajat(String nume, int salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
		this.subordonati = new ArrayList<Angajat>();
	}

	public List<Angajat> getSubordonati() {
		return subordonati;
	}
	
	public void add(Angajat a){
		this.subordonati.add(a);
	}
	
	public void remove(Angajat a){
		this.subordonati.remove(a);
	}

	@Override
	public String toString() {
		return "\nAngajatul" + " "+ nume + ",avand salariul " + salariu;
	}
}
