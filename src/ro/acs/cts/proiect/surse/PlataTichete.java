package ro.acs.cts.proiect.surse;

public class PlataTichete implements Plata{

	@Override
	public void plateste(double suma) {
		System.out.println("Se plateste cu tichete suma " + suma);
		
	}

}
