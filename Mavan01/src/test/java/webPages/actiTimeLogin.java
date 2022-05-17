package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility02;

public class actiTimeLogin extends SeleniumUtility02 {
	
	

	WebDriver driver;
	
	public actiTimeLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="input#username")
	private WebElement userNameInputField;
			
	@FindBy(css="input[name='pwd']")
	private WebElement passwordInputFiled;
	
	@FindBy(css="#loginButton")
	private WebElement loginButton;
	
	
	
	public WebElement getUserNameInputField() {
		return userNameInputField;
	}

	public WebElement getPasswordInputFiled() {
		return passwordInputFiled;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public String getLoginPageTitle() {
		waitForElementToBeClickable(userNameInputField);
		return getCurrentTitleOfApplication();
	}
	
	
	public void login(String username, String password) {
		typeInput(userNameInputField,username);
		typeInput(passwordInputFiled,password);
		clickOnElement(loginButton);
	}
	
	
}
