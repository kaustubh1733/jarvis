package webPagesScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility02;
import webPages.actiTimeLogin;
import webPages.actiTimeHome;

public class LoginLogouScript extends SeleniumUtility02 {

	

	WebDriver driver = null;
	actiTimeLogin getLoginPage = null;
	actiTimeHome getHomePage = null;

	@BeforeTest
	public void preconditions() {
		driver = setUp("chrome", "https://demo.actitime.com/user/submit_tt.do");
		getLoginPage = new actiTimeLogin(driver);
		getHomePage = new actiTimeHome(driver);
		getLoginPage.login("admin", "manager");
	}
	

	@Test
	public void testLoginFunctionality() {
		String actualHomePageTitle = getHomePage.getHomePageTitle();
		System.out.println("page title = "+ actualHomePageTitle);
	//	Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track",
			//	"Either logout button is not functional or present");
	}

	
	
	@Test
	public void testLogoutFunctionality() {
		getHomePage.logoutFromApp();
		String loginPageTitle = getLoginPage.getLoginPageTitle();
		System.out.println("home page title = "+ loginPageTitle);
		//Assert.assertEquals(loginPageTitle, "actiTIME - Login",
			//	"Either logout button is not functional or present");
	}

	
	@AfterTest
	public void postCondition() {
		cleanUp();
	}
		
		
		
}
