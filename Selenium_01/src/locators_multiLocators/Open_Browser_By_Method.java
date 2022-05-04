package locators_multiLocators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_By_Method {

	public static void main(String[] args) {
		
		String chromepath = ".\\execute\\chromedriver.exe";
		String geckopath = ".\\execute\\geckodriver.exe";
		
		openBrowser(chromepath,"Chrome");
		openBrowser(geckopath,"Firefox");
		
	}
	
	static void openBrowser(String driverPath, String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			
		ChromeDriver dive1=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", driverPath);
			FirefoxDriver drive2 = new FirefoxDriver();
			
		}
		
		
		
	}
	
	
	

}
