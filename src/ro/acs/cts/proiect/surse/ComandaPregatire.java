package ro.acs.cts.proiect.surse;

public class ComandaPregatire implements StareComanda{

	@Override
	public void spuneStare(Comanda comanda) {
		System.out.println("Comanda in curs de pregatire");
		comanda.setStareComanda(this);
	}

}
