package keyboard_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Keyboard_Operation_03 {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder = 'First Name']"));
		//type first name as jarvis and use ctrl+a keys
		firstName.sendKeys("J.A.R.V.I.S.",Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(1500);
		//then copy the text using ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c",Keys.TAB));
		Thread.sleep(1500);
		//paste the text in last name using ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		Thread.sleep(1800);
		firstName.sendKeys(Keys.TAB);
		
		
		
	
		
		
	}

}
