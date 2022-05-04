package locators_multiLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_01 {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir")+"\\execute\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver drive = new FirefoxDriver();
		
		//maximize the window of browser
		drive.manage().window().maximize();
		//implicit path
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		drive.get("https://demo.actitime.com/login.do");
		
		
		WebElement userNameInputField = drive.findElement(By.id("username"));
		System.out.println("is userNameInputField displayed = "+ userNameInputField.isDisplayed());
		System.out.println("is userNameInputField enable = "+ userNameInputField.isEnabled());
		String actualDefaultTextOnUserNameInputField = userNameInputField.getAttribute("placeholder");
		System.out.println("Default text validation for username field = "+ actualDefaultTextOnUserNameInputField.equals("Username"));
		userNameInputField.sendKeys("admin");
		
		
		
		WebElement passwordInputField = drive.findElement(By.name("pwd"));
		System.out.println("Password input field visibility status = "+ passwordInputField.isDisplayed());
		System.out.println("is password input field enable = "+ passwordInputField.isEnabled());
		String actualTextOnPasswordField = passwordInputField.getAttribute("type");
		System.out.println("default text validation of password field = "+ actualTextOnPasswordField.equals("password"));
		passwordInputField.sendKeys("manager");
		
		
		WebElement checkBox = drive.findElement(By.name("remember"));
		System.out.println("chech box is visible = "+ checkBox.isDisplayed());
		System.out.println("check box is enable = "+ checkBox.isEnabled());
		String actualDefaultTextOnCheckBox = checkBox.getAttribute("id");
		System.out.println("default text validation of check box = "+ actualDefaultTextOnCheckBox.equals("keepLoggedInCheckBox"));
		System.out.println("is check box selected = "+ checkBox.isSelected());
		checkBox.click();
		System.out.println("is check box selected = "+ checkBox.isSelected());
		
		
		WebElement loginButton = drive.findElement(By.id("loginButton"));
		System.out.println("login button visibility status = "+ loginButton.isDisplayed());
		System.out.println("login button clickable status = "+ loginButton.isEnabled());
		String actualButtonName = loginButton.getText();
		System.out.println(actualButtonName);
		System.out.println("login button name validation = "+ actualButtonName.equals("Login"));
		loginButton.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
