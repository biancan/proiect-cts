package ro.acs.cts.proiect;

public class Restaurant {
	private static Restaurant instance;
	
	private Restaurant(){
		
	}
	
	public static Restaurant getInstance(){
		if (instance == null){
			instance = new Restaurant();
		}
		return instance;
	}
	
	
}
