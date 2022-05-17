package V_TigerWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility02;

public class VTigerLogin extends SeleniumUtility02 {
	
	WebDriver driver;
	
	public VTigerLogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(css="input#username")
	private WebElement userNameInputField;
	
	public WebElement getUserName() {
		return userNameInputField;
	}
	
	@FindBy(css="input#password")
	private WebElement passwordInputField;
	
	public WebElement getPasswordInputField() {
		return passwordInputField;
	}
	
	public void login(String username,String password) {
		
		typeInput(userNameInputField,username);
		typeInput(passwordInputField,password);
		getActiveElement().sendKeys(Keys.TAB);
		getActiveElement().sendKeys(Keys.ENTER);
	}
	
	

}
