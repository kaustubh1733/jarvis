package calender_Attribute_Validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().arch64().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().arch64().setup();
		
		WebDriver driver1 = new FirefoxDriver();
		
		

	}

}
