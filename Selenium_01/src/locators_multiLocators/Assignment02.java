package locators_multiLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment02 {

	public static void main(String[] args) {
		String path1 =  System.getProperty("user.dir")+ ".\\execute\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path1);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println("Title of the page = " + driver.getTitle());
		
		//***
		if(driver.getTitle().equalsIgnoreCase("Facebook")) {
			System.out.println("page title is verified");
		}else {
			System.out.println("page title is got change");
		}
		
		System.out.println("Title of page = "+ driver.getTitle());
		//driver.close();
		
		
		
		
		
		
		
	}

}
