package keyboard_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Keyboard_Operation_02 {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		
	}

}
