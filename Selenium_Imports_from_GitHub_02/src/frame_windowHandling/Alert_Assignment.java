package frame_windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Alert_Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//div[div[span[text()='Click Button to see alert ']]]/div[2]/button")).click();
		System.out.println("inner text of alert1 : "+ driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		WebElement timer = driver.findElement(By.id("timerAlertButton"));
		WebDriverWait wait = new WebDriverWait(driver,25);
		timer.click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("inner text of alert2 : "+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("confirmButton")).click();
		System.out.println("inner text of alert2 : "+ driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		System.out.println("inner text of alert2 : "+ driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Thor Love and Thunder");
		driver.switchTo().alert().accept();
		
		
		
	}	
	
}
