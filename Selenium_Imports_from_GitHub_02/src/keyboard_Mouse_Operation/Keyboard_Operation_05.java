package keyboard_Mouse_Operation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Keyboard_Operation_05 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.flipkart.com/");
		
		try {
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			
		}
		
		//Thread.sleep(1800);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		//or
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		//or
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	    /*Possible ways to refresh the browser
		 * 1. driver.navigate().refresh()
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same url
		 * 4. ctrl+R
		 */
		
		
		
		
		
	}

}
