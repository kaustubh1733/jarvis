package locators_multiLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Load_Browser {

	public static void main(String[] args) {
		
		//get the required browser executable path
		String path1 = "F:\\workspace\\Selenium1\\execute\\chromedriver.exe";
		
		String path2 = ".\\execute\\chromedriver.exe";
		
		String path3 = System.getProperty("user.dir")+"\\execute\\chromedriver.exe";
		
		//Set required browser executable path using System.setProperty(String Key, String Valu);
		//System.setProperty(	, "path2");
		//System.setProperty("webdriver.chrome.driver",path3);
				//or
		System.setProperty("webdriver.chrome.driver",".\\execute\\chromedriver.exe");
		
		//Create an instance of required browser class
		
		ChromeDriver drive = new ChromeDriver();
		
	}

}
/**
 * Selenium always opens new browser for every run, it won't work on already opened browser
 * Browser open by selenium will not have any cookies or history or download history or plug-in
 */ 