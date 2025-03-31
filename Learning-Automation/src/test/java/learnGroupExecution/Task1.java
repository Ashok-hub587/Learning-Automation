package learnGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task1 {

	@Test(groups = "ST")
	public void m1() {
		Reporter.log("m1 is executed", true);;
	}
	
	@Test(groups = "FT")
	public void m2() {
		Reporter.log("m2 is executed", true);
	}
	
	@Test(groups = "ST")
	public void m3() {
		Reporter.log("m3 is executed", true);
	}
	
	@Test(groups = "FT")
	public void m4() {
		Reporter.log("m4 is executed", true);
	}
}
