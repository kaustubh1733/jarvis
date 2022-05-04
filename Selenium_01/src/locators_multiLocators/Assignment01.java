package locators_multiLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://demo.actitime.com/");
		String title = drive.getTitle();
		System.out.println("Title of page : "+ title);
		System.out.println("Length of title : "+ title.length());
		
		String url = drive.getCurrentUrl();
		System.out.println("current url :"+ url);
		System.out.println("is both url are same : "+url.equalsIgnoreCase("https://demo.actitime.com/"));
		
		String source = drive.getPageSource();
		System.out.println("HTML Source code = "+source);
		System.out.println("Source code length : "+ source.length());
		
		//drive.close();
		

	}

}
