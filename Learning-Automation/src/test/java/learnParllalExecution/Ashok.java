package learnParllalExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ashok extends BaseConfigurationCB{

	@Test
	public void eatBiryani() {
		Reporter.log("Eating Mandi biryani", true); //from TestNG
	}
}
