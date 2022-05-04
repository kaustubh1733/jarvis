package locators_multiLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_03 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\execute\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.amazon.in");
		
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		d.findElement(By.id("ap_email")).sendKeys("8805059381");
		
		
		

	}

}
