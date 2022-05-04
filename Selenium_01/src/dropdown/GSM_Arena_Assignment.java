package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSM_Arena_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> next = dr.findElements(By.cssSelector(".nav-pages>a"));
		
		System.out.println(next.size());
		
		for(int i=0;i<next.size();i++) {
			
			System.out.println(dr.getCurrentUrl());
			next.get(i).click();
			Thread.sleep(1000);
			next = dr.findElements(By.cssSelector(".nav-pages>a"));
			
		}
		
		

	}

}
