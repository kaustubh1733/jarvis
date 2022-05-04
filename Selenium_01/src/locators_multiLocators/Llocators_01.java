package locators_multiLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Llocators_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		//Implicit wait 
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  // it will wait upto 30 seconds for operation perform ... if operation perform under 30 seconds 
																	// (that means 2 or 5 seconds) then it will move to next operation it will not take 30 seconds
																   // implicit wait required only one time throughout the program 
		
		dr.get("https://demo.actitime.com/");
		
		String expectedTitle = "actiTIME - Login";
		String actualTitle = dr.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page open successfully");
		}else {
			System.out.println("Either Login page not open or login page title change");
		}
		
		
		
		WebElement input = dr.findElement(By.id("username"));
		input.sendKeys("admin123456");
		
		input.clear();
		input.sendKeys("admin");
		
		WebElement pass = dr.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		dr.findElement(By.id("loginButtonContainer")).click();
		
		
		WebElement logoutButton = dr.findElement(By.id("logoutLink"));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
		
		
		String actaulHomePageTitle=dr.getTitle();//0-30
		System.out.println("Actuatl HomePage title: "+actaulHomePageTitle);
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		if(actaulHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is successfull and home page title is also varified..");
		}else {
			System.out.println("Either Login is failed or home page title is changed");
		}
		
		
		
		dr.findElement(By.id("logoutLink")).click();
		//logoutButton.click();
		
		
		//dr.close();

	}

}
