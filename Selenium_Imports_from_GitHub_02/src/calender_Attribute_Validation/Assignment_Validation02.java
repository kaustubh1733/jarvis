package calender_Attribute_Validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Validation02 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dri.manage().window().maximize();
		
		dri.get("https://www.techlistic.com/");
		
		dri.findElement(By.cssSelector("nav>div>div>div>div>div>div>ul>li>[href='https://www.techlistic.com/p/java.html']")).click();
		
		

	}

}
