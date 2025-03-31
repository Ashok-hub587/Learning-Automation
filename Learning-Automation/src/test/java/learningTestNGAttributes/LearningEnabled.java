package learningTestNGAttributes;

import org.testng.annotations.Test;

public class LearningEnabled {

	@Test(enabled=false)
	public void m1() {
		System.out.println("m1 pass");
	}
	
	@Test(enabled=true)
	public void m2() {
		System.out.println("m2 pass");
	}
}
