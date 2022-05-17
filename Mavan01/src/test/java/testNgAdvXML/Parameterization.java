package testNgAdvXML;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility01;

public class Parameterization extends SeleniumUtility01{
	
	@Parameters({"browser"})
	@Test(priority = 1)
	public void testCaseOne(String browser) {
		System.out.println("browser pass as - "+ browser);
		
	}
	
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void testcaseTwo(String username, String password) {
		System.out.println("parameter for username passes as -"+username);
		System.out.println("parameter for password passes as -"+password);
	}
	
	@Parameters({"browser","username","password"})
	@Test(priority =3)
	public void testCaseThree(String browser, String username, String password) {
		System.out.println("parameter for browser passes as -"+browser);
		System.out.println("parameter for username passes as -"+username);
		System.out.println("parameter for password passes as -"+password);
	}
	
	
	@Parameters({"browser","username","password"})
	@Test(priority=4)
	public void testCaseFour(String browser, String username, String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
		cleanUp();
	}
	
	
	

}
