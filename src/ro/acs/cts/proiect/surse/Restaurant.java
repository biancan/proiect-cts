package ro.acs.cts.proiect.surse;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private static Restaurant instance;
	private List<Angajat> angajati;
	
	private Restaurant(){
		
	}
	
	public static Restaurant getInstance(){
		if (instance == null){
			instance = new Restaurant();
		}
		return instance;
	}

	public List<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(List<Angajat> angajati) {
		this.angajati = angajati;
	}

	public static void setInstance(Restaurant instance) {
		Restaurant.instance = instance;
	}
	
}
