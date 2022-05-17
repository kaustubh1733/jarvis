package webPagesScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility02;
import webPages.GoogleSearchPage;

public class GoogleSearchScript {
	@Test
	public void test01() {
		SeleniumUtility02 s2=new SeleniumUtility02();
		WebDriver driver = s2.setUp("chrome","https://www.google.com");
		GoogleSearchPage getGoogleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		getGoogleSearchPage.searchText("I am Iron-Mam");
		
	}

}
