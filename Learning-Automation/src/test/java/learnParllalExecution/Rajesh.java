package learnParllalExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rajesh extends BaseConfigurationCB{
	
	@Test
	public void drinksOnlyRaw() {
		Reporter.log("mix water with juice", true);
	}

}
