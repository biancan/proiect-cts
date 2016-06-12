package ro.acs.cts.proiect.surse;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRestaurant extends TestCase {
	Restaurant restaurant; 
	
	@Test
	public void aFostInitializat(){
		Assert.assertNotNull("A fost initializat", restaurant);
	}
	
	@Before
	public void initialize(){
		Restaurant restaurant = Restaurant.getInstance();
	}
	
	@After
	public void destroy(){
		System.out.println("Obiectul a fost distrus");
	}
	
}
