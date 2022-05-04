package locators_multiLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_02 {

	public static void main(String[] args) {
		
		/*
		
		System.setProperty("webdriver.gecko.driver",".\\execute\\geckodriver.exe");
		
		WebDriver driv1 = new FirefoxDriver();
		
		driv1.get("https://demosite.executeautomation.com/Login.html");
		
		driv1.findElement(By.name("UserName")).sendKeys("execution");
		
		driv1.findElement(By.name("Password")).sendKeys("admin");
		
		driv1.findElement(By.name("Login")).click();
		
		*/
		
		System.setProperty("webdriver.chrome.driver",".\\execute\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demosite.executeautomation.com/Login.html");
		
		driv.findElement(By.name("UserName")).sendKeys("execution");
		
		driv.findElement(By.name("Password")).sendKeys("admin");
		
		driv.findElement(By.name("Login")).click();

	}

}
