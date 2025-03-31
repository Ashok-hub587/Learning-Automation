package learningTestNGAttributes;

import org.testng.annotations.Test;

public class LearningPriority {

	@Test(priority = 1)
	public void a() {
		System.out.println("Eating");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("Studying");
	}
	
	@Test(priority = 2)
	public void b() {
		System.out.println("Sleeping");
	}
	
}
