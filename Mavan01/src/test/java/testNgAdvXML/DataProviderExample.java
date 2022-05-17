package testNgAdvXML;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility01;

public class DataProviderExample extends SeleniumUtility01 {
	@Test(dataProvider = "getData")
	public void getDetails(String username, String password) {
		System.out.println("username is -"+username);
		System.out.println("password is -"+password);
	}
	
	@Test(dataProvider = "testdata")
	public void setdetails(String browser, String username, String password) {
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
			driver.close();
	}
	

	
	@DataProvider(name = "getData")
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin";
		data[0][1]="Test@123";
		
		data[1][0] = "";
		data[1][1] = " ";
		
		data[2][0] = "asdg";
		data[2][1] = "hfkg";
		
		return data;
			
	}
	
	@DataProvider(name="testdata")
	public Object[][] credentials(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Chrome";
		data[0][1] = "admin";
		data[0][2] = "Test@123";
		
		data[1][0] = "firefox";
		data[1][1] = "admin";
		data[1][2] = "Test@123";
		
		data[2][0] = "Chrome";
		data[2][1] = "admin";
		data[2][2] = "Test";
		
		
		return data;
	}









}
