package ro.acs.cts.proiect.surse;

public class ComandaServire implements StareComanda{

	@Override
	public void spuneStare(Comanda comanda) {
		System.out.println("Comanda este in curs de servire");
		comanda.setStareComanda(this);
	}

}
