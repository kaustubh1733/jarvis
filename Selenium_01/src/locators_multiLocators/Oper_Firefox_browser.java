package locators_multiLocators;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oper_Firefox_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\execute\\geckodriver.exe");
		
		FirefoxDriver fire = new FirefoxDriver();
		
		//generic way
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		

	}

}
