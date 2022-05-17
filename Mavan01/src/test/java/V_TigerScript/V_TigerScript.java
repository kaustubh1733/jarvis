package V_TigerScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import V_TigerWebPages.AddNewContactPage;
import V_TigerWebPages.HomePage;
import V_TigerWebPages.VTigerLogin;
import utilities.SeleniumUtility02;

public class V_TigerScript extends SeleniumUtility02 {

	WebDriver driver = null;
	VTigerLogin getLoginPage;
	HomePage getHomePage;
	AddNewContactPage addNewContact;
	
	
	@BeforeTest
	public void loginTest() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getLoginPage = new VTigerLogin(driver);
		getHomePage = new HomePage(driver);
		addNewContact=new AddNewContactPage(driver);
		getLoginPage.login("admin", "Test@123");

	}

	@Test
	public void createContact() {

		getHomePage.clickOnMarketing();
		getHomePage.clickOnContacts();
		addNewContact.clickOnAddNewContact();
	}

}
