package ro.acs.cts.proiect;

public class Comanda {
	private String fel1;
	private String fel2;
	private String bautura;
	private String desert;
	
	private Comanda(){}

	public String getFel1() {
		return fel1;
	}

	public void setFel1(String fel1) {
		this.fel1 = fel1;
	}

	public String getFel2() {
		return fel2;
	}

	public void setFel2(String fel2) {
		this.fel2 = fel2;
	}

	public String getBautura() {
		return bautura;
	}

	public void setBautura(String bautura) {
		this.bautura = bautura;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}
	
	public static class Builder{
		Comanda comanda = new Comanda();
		
		public Builder(){}
		
		public Builder adaugaFel1(String fel1){
			comanda.setFel1(fel1);
			return this;
		}
		
		public Builder adaugaFel2(String fel2){
			comanda.setFel2(fel2);
			return this;
		}
		
		public Builder adaugaBautura(String bautura){
			comanda.setBautura(bautura);
			return this;
		}
		public Builder adaugaDesert(String desert){
			comanda.setDesert(desert);
			return this;
		}
		
		public Comanda build(){
			return comanda;
		}
	}

}
