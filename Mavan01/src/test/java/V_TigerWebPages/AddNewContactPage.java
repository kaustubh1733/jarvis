package V_TigerWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility02;

public class AddNewContactPage  extends SeleniumUtility02{
	
	WebDriver driver;
	
	public AddNewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="Contacts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement clickOnAddNewContact;
	
	public WebElement getClickOnAddNewContact() {
		return clickOnAddNewContact;
	}



	



	
	@FindBy(className="className")
	private WebElement clickOnMR;
	
	public WebElement getClickOnMR() {
		return clickOnMR;
	}
	
	@FindBy(id="Contacts_editView_fieldName_firstname")
	private WebElement clickOnFirstName;
	
	public WebElement getClickOnFirstName() {
		return clickOnFirstName;
	}

	
	
	public void clickOnAddNewContact() {
		clickOnElement(clickOnAddNewContact);
		clickOnElement(clickOnMR);
		clickOnElement(clickOnFirstName);
		clickOnFirstName.sendKeys("Tony", Keys.TAB);
	}
	
	
	
}
