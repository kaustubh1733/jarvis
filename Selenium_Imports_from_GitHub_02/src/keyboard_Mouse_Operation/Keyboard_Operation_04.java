package keyboard_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Keyboard_Operation_04 {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.flipkart.com/");

		// using Escape of keyboard to avoid login popup
		WebElement element = driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		
//		for(int i=0;i<13;i++) {
//			element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1800);
//		}
		
		
		//directly go to the bottom of the page 
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		Thread.sleep(1800);
		element.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		
		//go to top of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
		
	}

}
