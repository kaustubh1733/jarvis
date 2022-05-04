package keyboard_Mouse_Operation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Mouse_Operation_03 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);
		
		List<WebElement> sourceElement = driver.findElements(By.cssSelector("ul#gallery>li"));
		
		WebElement target=driver.findElement(By.id("trash"));
		
		act.dragAndDrop(sourceElement.get(0),target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceElement.get(1),target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceElement.get(2),target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceElement.get(3),target).build().perform();
	}

}
