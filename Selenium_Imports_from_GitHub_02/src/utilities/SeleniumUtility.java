package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	
	
	public WebDriver setUp(String BrowserName, String appUrl) {
		
		WebDriver driver = null;
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(appUrl);
		
		return driver;
	}

}
