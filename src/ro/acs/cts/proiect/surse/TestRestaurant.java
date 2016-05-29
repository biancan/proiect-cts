package ro.acs.cts.proiect.surse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

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
	
}
