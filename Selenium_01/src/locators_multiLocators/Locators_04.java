package locators_multiLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_04 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		dr.findElement(By.id("username")).clear();
		dr.findElement(By.id("username")).sendKeys("admin");
		dr.findElement(By.id("password")).clear();
		dr.findElement(By.id("password")).sendKeys("Test@123");
		dr.findElement(By.className("button")).click();
		dr.findElement(By.className("userName")).click();
		dr.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		

	}

}
