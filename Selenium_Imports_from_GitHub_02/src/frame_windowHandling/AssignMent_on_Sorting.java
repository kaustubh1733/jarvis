package frame_windowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class AssignMent_on_Sorting {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		
		List<WebElement> list = driver.findElements(By.cssSelector("ul#sortable>li"));
		for(int i=6;i>=0;i--) {
			act.dragAndDrop(list.get(0),list.get(i)).build().perform();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
