package frame_windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Prompt_PopUp_Alert {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//as required element is present in frame 
		WebElement frame = driver.findElement(By.cssSelector("#iframe>#iframewrapper>iframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2500);
		System.out.println("Alert text msg: "+ driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Doctor Strange Multiverse of Madness");
		driver.switchTo().alert().accept();
		
		Thread.sleep(4500);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().dismiss();

	}

}
