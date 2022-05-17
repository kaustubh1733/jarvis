package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility02;

public class actiTimeHome extends SeleniumUtility02 {
	
	WebDriver driver;
	
	public actiTimeHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logoutLink")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	public void logoutFromApp() {
		waitForElementDisplayed(logoutLink);
		clickOnElement(logoutLink);
	}
	
	public String getHomePageTitle() {
		waitForElementToBeClickable(logoutLink);
		return getCurrentTitleOfApplication();
	}
	
}
