package frame_windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Frame_Handling {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://jqueryui.com/droppable/");
		
		//Switch your control to frame using webelement
	//	WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		
	//	driver.switchTo().frame(frame);
				//or
	//	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				//or
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, destination).build().perform();
		
		
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//back to main page 
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
		
		
		
		
		
		
		
	}

}
