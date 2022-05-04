package frame_windowHandling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Handling_Active_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demo.actitime.com/login.do");
		
		//validate by default cursor is pointing to username input field
		WebElement activeObject = driver.switchTo().activeElement();
		
		String activeObjectPlaceholder = activeObject.getAttribute("placeholder");
		String expectedActiveObject = "Username";
		
		if(activeObjectPlaceholder.equals(expectedActiveObject)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is unsucessful");
		}
			
		
		activeObject.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
		
		
		
		
		
	}

}
