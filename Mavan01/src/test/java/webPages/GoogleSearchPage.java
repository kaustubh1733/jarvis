package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.SeleniumUtility02;

public class GoogleSearchPage extends SeleniumUtility02 {
	
	@FindBy(name="q")
	private WebElement searchTextField;
	
	public void searchText(String text) {
		typeInput(searchTextField,text);
		getActiveElement().sendKeys(Keys.ENTER);
	}
}
