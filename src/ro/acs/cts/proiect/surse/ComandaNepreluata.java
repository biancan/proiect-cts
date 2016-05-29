package ro.acs.cts.proiect.surse;

public class ComandaNepreluata implements StareComanda {

	@Override
	public void spuneStare(Comanda comanda) {
		System.out.println("Comanda este nepreluata");
		comanda.setStareComanda(this);
	}
}
