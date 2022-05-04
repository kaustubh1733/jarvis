package pack_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Vtiger_EndToEnd {

	@Test
	public void vtigerEndToEnd() {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

		WebElement userName = driver.findElement(By.cssSelector("input#username"));
		userName.clear();
		userName.sendKeys("admin", Keys.TAB);

		driver.switchTo().activeElement().sendKeys("Test@123", Keys.TAB, Keys.ENTER);

		driver.findElement(By.cssSelector("#appnavigator>div.row.app-navigator")).click();
		List<WebElement> menu = driver.findElements(By.cssSelector(".app-list.row>div"));
		for (int i = 0; i < menu.size(); i++) {
			WebElement menuOption = menu.get(i);
			String menuName = menuOption.getText();
			// System.out.println("menu names = "+ menuName);
			if (menuName.equals("MARKETING")) {
				menuOption.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("a[href='index.php?module=Contacts&view=List&app=MARKETING']")).click();

		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.className("select2-choice")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']//ul//li[2]")).click();

		driver.findElement(By.className("select2-choice")).sendKeys(Keys.TAB);
		WebElement firstName = driver.findElement(By.id("Contacts_editView_fieldName_firstname"));

		/* FirstName  */	
		firstName.sendKeys("Tony", Keys.TAB);

		/* Last Name */
		driver.switchTo().activeElement().sendKeys("Stark", Keys.TAB);

		/* Office phone */
		driver.switchTo().activeElement().sendKeys("01-186-45-465", Keys.TAB);

		/* Organization Name */
		driver.switchTo().activeElement().sendKeys("Stark Industries", Keys.TAB);

		/* Mobile Phone */
		driver.switchTo().activeElement().sendKeys("001-1264-45-4563", Keys.TAB);

		/* Lead Source */
		driver.findElement(By.cssSelector("div[id='s2id_autogen3']>a")).click();
		driver.findElement(By.id("select2-result-label-16")).click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		/* Home Phone */
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		/* Title */
		driver.switchTo().activeElement().sendKeys("MARK-70", Keys.TAB);

		/* Secondary phone */
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		/* DepartMent */
		driver.switchTo().activeElement().sendKeys("NANO Technology", Keys.TAB);
		/* Fax */
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		/* Primary Email */
		driver.switchTo().activeElement().sendKeys("stark@coolAvengers.com", Keys.TAB);

		/* Date of Birth */
		driver.switchTo().activeElement().sendKeys("14-05-1984", Keys.TAB);

		/* Assistants */
		driver.switchTo().activeElement().sendKeys("Pepper", Keys.TAB);
		/* Report to */
		driver.switchTo().activeElement().sendKeys("J.A.R.V.I.S.", Keys.TAB);
		/* Assistant phone */
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		/* Seconadry Email */
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		/* Email opt out */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);

		/* do not call */
		// driver.switchTo().activeElement().click();
		WebElement donotcall = driver.findElement(By.cssSelector("#Contacts_editView_fieldName_donotcall"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(donotcall));
		donotcall.click();

		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);

		/* Reference */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);

		/* Assign to */
		driver.switchTo().activeElement().click();
		WebElement assignTo = driver.findElement(By.xpath("//ul[li[2][ul[@class='select2-result-sub']]]//li[3]"));

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(assignTo));
		assignTo.click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/* notify owner */
		WebElement notifyOwner = driver.findElement(By.cssSelector("#Contacts_editView_fieldName_notify_owner"));
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.elementToBeClickable(notifyOwner));
		notifyOwner.click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		/* portal user */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);

		/* support date start */
		driver.switchTo().activeElement().sendKeys("02-05-2022", Keys.TAB, Keys.ARROW_DOWN);

		/* support date end */
		driver.switchTo().activeElement().sendKeys("25-05-2022", Keys.TAB, Keys.ARROW_DOWN);

		/* mailing street */
		driver.switchTo().activeElement().sendKeys("Stark Tower, Ney York City",Keys.TAB, Keys.ARROW_DOWN);
		/* other street */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		/* Mailing P.O. Box */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		/* Other P.O. Box */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);

		/* mailing city */
		driver.switchTo().activeElement().sendKeys("Ney York City",Keys.TAB, Keys.ARROW_DOWN);
		/* other city */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/*Mailing State */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/*Other State */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/* Mailing Zip */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/* other Zip */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/*Mailing Country*/
		driver.switchTo().activeElement().sendKeys("USA",Keys.TAB, Keys.ARROW_DOWN);
		
		/*Other Country */
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.ARROW_DOWN);
		
		/*Description */
		driver.switchTo().activeElement().sendKeys("I am Iron Man",Keys.TAB, Keys.ARROW_DOWN);
		
		
		/*save */
		driver.findElement(By.cssSelector(".btn.btn-success.saveButton")).click();
		
	
		/*edit contacts */
		
		/*go back to contacts */
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&view=List&viewname=7&app=MARKETING' or text=' Contacts']")).click();
		
		
		
		
		//select contact 
		driver.findElement(By.cssSelector(".listViewEntriesCheckBox")).click();
		//click on the edit button 
		driver.findElement(By.cssSelector("#Contacts_listView_massAction_LBL_EDIT")).click();
		

		/*
		//edit description 
		
		WebElement firstName01 = driver.findElement(By.id("Contacts_editView_fieldName_firstname"));
		WebDriverWait wait4 = new WebDriverWait(driver,20);
		wait4.until(ExpectedConditions.elementToBeClickable(firstName01));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		//driver.findElement(By.cssSelector("#Contacts_editView_fieldName_support_end_date")).sendKeys(Keys.PAGE_DOWN);
		WebElement description = driver.findElement(By.cssSelector("textarea[name='description']"));
		description.clear();
		description.sendKeys("Love You 3000");
		//save 
		driver.findElement(By.cssSelector(".btn.btn-success.saveButton")).click();
		*/
		
		
		
		//edit the contacts
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&view=Detail&record=6&app=MARKETING' or text() = 'Tony']")).click();
		driver.findElement(By.id("Contacts_detailView_basicAction_LBL_EDIT")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("#Contacts_editView_fieldName_support_end_date")).sendKeys(Keys.PAGE_DOWN);
		WebElement description = driver.findElement(By.cssSelector("textarea[name='description']"));
		description.clear();
		description.sendKeys("Love You 3000");
		//save 
		driver.findElement(By.cssSelector(".btn.btn-success.saveButton")).click();
		//back to contacts home screen
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&view=List&viewname=7&app=MARKETING' or text=' Contacts']")).click();
		
		
		
		
	
		
		
		//delete contact 
		WebElement checkbox = driver.findElement(By.cssSelector("tr#Contacts_listView_row_1>td>div>span>.listViewEntriesCheckBox"));
		WebDriverWait wait3 = new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();
		driver.findElement(By.cssSelector("#Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
		
		
	}

}
