package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task_2 {

	@BeforeClass
	public void browserSetup() {
		System.out.println();
		System.out.println("Browser Setup Success...!");
	}
	@Test
	public void addSecondProduct() {
		System.out.println("Second product addded Successfully..!");
	}
	
	@Test
	public void rmoveSecondProduct() {
		System.out.println("Second product removed Successfully..!");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout successful...!");
	}
	
	@AfterClass
	public void browserTerminate() {
		System.out.println("Browser Termination successful...!");
		System.out.println();
	}
}
