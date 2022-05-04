package keyboard_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Keyboard_Operation_01 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("firefox","https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		
		
	}

}
