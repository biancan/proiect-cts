package ro.acs.cts.proiect.surse;

public class ComandaPreluata implements StareComanda{

	@Override
	public void spuneStare(Comanda comanda) {
		System.out.println("Comanda este in curs de preluare.");
		comanda.setStareComanda(this);
	}
	
	

}
