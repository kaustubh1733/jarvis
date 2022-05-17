package testNgAdvXML;

import org.testng.annotations.Test;

import utilities.SeleniumUtility01;

public class ParallelExecutionMethod extends SeleniumUtility01{
	@Test
	public void tc01() {
		setUp("chrome","https://www.google.com");
		driver.close();
	}

	@Test
	public void tc02() {
		setUp("firefox","https://www.google.com");
		driver.close();
	}
}
