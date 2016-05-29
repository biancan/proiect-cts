package ro.acs.cts.proiect;

public class PlataCard implements Plata {

	@Override
	public void plateste(double suma) {
		System.out.println("Se plateste cu cardul suma " + suma);
		
	}

}
