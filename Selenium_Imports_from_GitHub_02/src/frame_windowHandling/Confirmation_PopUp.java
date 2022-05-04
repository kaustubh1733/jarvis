package frame_windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Confirmation_PopUp {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//as required element is present in frame 
				WebElement frame = driver.findElement(By.cssSelector("#iframe>#iframewrapper>iframe"));
				driver.switchTo().frame(frame);
				
				
				
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Thread.sleep(2500);
				System.out.println("Alert text msg: "+ driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				Thread.sleep(2500);
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				driver.switchTo().alert().dismiss();

				
				
				

/**
In order handle any JavaScirpt Pop-up(application specific) we need use driver.switchTo().alert()
because java script popup doesn't contain HTML code
we use predefined functions of Alert to perform any operation on it
after every action control comes back to the main page


*/
	}

}
