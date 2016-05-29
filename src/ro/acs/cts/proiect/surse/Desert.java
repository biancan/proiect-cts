package ro.acs.cts.proiect.surse;

public class Desert {

	private String denumire;
	private double cantitate;
	private double pret;
	
	public Desert(String denumire, double cantitate) {
		super();
		this.denumire = denumire;
		this.cantitate = cantitate;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public double getCantitate() {
		return cantitate;
	}
	public void setCantitate(double cantitate) {
		this.cantitate = cantitate;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public double calculeazaValoare(){
		return this.pret * this.cantitate;
	}
	
	@Override
	public String toString() {
		return "Desert " + denumire;
	}
	
}
