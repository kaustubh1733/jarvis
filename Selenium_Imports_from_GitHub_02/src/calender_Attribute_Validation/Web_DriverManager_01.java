package calender_Attribute_Validation;

import utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;

public class Web_DriverManager_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");
		
		driver.getTitle();
		
		
		
		
		
	}

}
