package V_TigerWebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility02;

public class HomePage extends SeleniumUtility02{
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#appnavigator>div.row.app-navigator")
	private WebElement clickOnMenu;
	
	@FindBy(css="a[href='index.php?module=Contacts&view=List&app=MARKETING']")
	private WebElement clickOncontacts;
	
	
	public WebElement getClickOnMenu() {
		return clickOnMenu;
	}
	
	public WebElement getClickOncontacts() {
		return clickOncontacts;
	}
	
	
	
	
	
	public void clickOnMarketing() {
		clickOnElement(clickOnMenu);
		List<WebElement> menu = driver.findElements(By.cssSelector(".app-list.row>div"));
		for (int i = 0; i < menu.size(); i++) {
			WebElement menuOption = menu.get(i);
			String menuName = menuOption.getText();
			if (menuName.equals("MARKETING")) {
				menuOption.click();
				break;
			}
		}
	}
	
	
	public void clickOnContacts() {
		clickOnElement(clickOncontacts);
	}
	
	
}
