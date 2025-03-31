package learningTestNGAttributes;

import org.testng.annotations.Test;

public class LearnigInvocationCount {

	@Test(invocationCount = 5)
	public void eat() {
		System.out.println("Eating");
	}
	
	@Test(invocationCount = 0)
	public void study() {
		System.out.println("Studying");
	}
}
