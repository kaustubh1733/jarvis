package pack_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Validation_01 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.manage().window().setSize(new Dimension(500,750));
		
		dr.get("https://www.amazon.in");
		String pageTitle1 = dr.getTitle();
		System.out.println("page title = "+ pageTitle1);
		
		WebElement amazonPay = dr.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=nav_cs_apay']"));
		amazonPay.click();
		String pageTitle2 = dr.getTitle();
		
		dr.navigate().back();

		dr.navigate().forward();
		
		System.out.println("verifying page title = "+pageTitle2.equals(dr.getTitle()));
		//dr.close();
		
}


}
