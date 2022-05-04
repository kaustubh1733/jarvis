package locators_multiLocators;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(800,650));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("web page title = "+ driver.getTitle());
		System.out.println("web page current url = "+ driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(10000);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
