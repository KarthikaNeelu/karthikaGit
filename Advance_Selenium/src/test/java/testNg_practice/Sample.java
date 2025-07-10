package testNg_practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample {

	
	
	@Test
	public void createProduct() {
		System.out.println("product is created");
	}
	@Test(priority=1)
	public void modifyProduct() {
		System.out.println("product is modified");
	}
	@Test(priority=2)
	public void deleteProduct() {
		System.out.println("product is deleted");
	}
	
}
