package ro.acs.cts.proiect.surse;

public class Comanda {
	private Fel1 fel1;
	private Fel2 fel2;
	private Bautura bautura;
	private Desert desert;
	private StareComanda stareComanda;
	
	private Comanda(){
		this.stareComanda = new ComandaNepreluata();
	}

	public Fel1 getFel1() {
		return fel1;
	}

	public void setFel1(Fel1 fel1) {
		this.fel1 = fel1;
	}

	public Fel2 getFel2() {
		return fel2;
	}

	public void setFel2(Fel2 fel2) {
		this.fel2 = fel2;
	}

	public Bautura getBautura() {
		return bautura;
	}

	public void setBautura(Bautura bautura) {
		this.bautura = bautura;
	}

	public Desert getDesert() {
		return desert;
	}
	
	public void setDesert(Desert desert) {
		this.desert = desert;
	}
	
	public StareComanda getStareComanda() {
		return stareComanda;
	}

	public void setStareComanda(StareComanda stareComanda) {
		this.stareComanda = stareComanda;
	}

	public static class Builder{
		Comanda comanda = new Comanda();
		
		public Builder(){}
		
		public Builder adaugaFel1(Fel1 fel1){
			comanda.setFel1(fel1);
			return this;
		}
		
		public Builder adaugaFel2(Fel2 fel2){
			comanda.setFel2(fel2);
			return this;
		}
		
		public Builder adaugaBautura(Bautura bautura){
			comanda.setBautura(bautura);
			return this;
		}
		public Builder adaugaDesert(Desert desert){
			comanda.setDesert(desert);
			return this;
		}
		
		public Comanda build(){
			return comanda;
		}
	}

	@Override
	public String toString() {
		return "Comanda cu " + fel1 + ", " + fel2 + ", "
				+ bautura + ", " + desert + ", "
				+ stareComanda;
	}
	
	

}
