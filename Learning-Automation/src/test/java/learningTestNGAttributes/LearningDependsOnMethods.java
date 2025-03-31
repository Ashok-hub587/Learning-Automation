package learningTestNGAttributes;

import org.testng.annotations.Test;

public class LearningDependsOnMethods {

	@Test(dependsOnMethods = "dad")
	public void child() {
		System.out.println("Eating");
	}
	
	@Test
	public void dad() {
		System.out.println("Studying");
	}
}
