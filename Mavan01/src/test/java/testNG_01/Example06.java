package testNG_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example06 {
	@Test
	

	public void loginPageValidationInActitimeApplication() {

		SeleniumUtility utility = new SeleniumUtility();
		WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Before login page title: " + driver.getTitle());
		// validation using TestNG
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");

		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		Assert.assertTrue(usernameInputField.isEnabled());
		Assert.assertTrue(usernameInputField.isEnabled(),"User NAme input field is not functionsal");
		Assert.assertEquals(usernameInputField.getAttribute("placeholder"),	"Username","Username input field placeholder name is changed");
		
		

		// identify remember check box
		WebElement checkBox = driver.findElement(By.name("remember"));
		Assert.assertTrue(checkBox.isDisplayed());
		Assert.assertTrue(checkBox.isEnabled(),"ChechBox is not Functional");
		Assert.assertFalse(checkBox.isSelected(), "Check box is default selected");
		
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
		driver.close();
	}
	

}
