package calender_Attribute_Validation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Assignment_calender_Handling {

	public static void main(String[] args) {
		
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver = s1.setUp("Chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		driver.findElement(By.cssSelector(".content.tasks")).click();
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		
		List<WebElement> customerDropdownOption = driver.findElements(By.cssSelector(".selectCustomerAndProject>table>tbody>tr.selectCustomerRow>td :nth-child(1)>div.scrollableDropdownView>.scrollableContainer>.contentWrapper>.searchItemList>div"));
		System.out.println("count of dropdown = "+customerDropdownOption.size());
		for(int i=0;i<customerDropdownOption.size();i++) {
			WebElement option = customerDropdownOption.get(i);
			String name = option.getText();
			//System.out.println("option ="+ option);
			
			if(option.equals("Galaxy Corporation")) {
				option.click();
				break;
			}
		}
		
		List<WebElement> projectDropdownOption = driver.findElements(By.cssSelector(".projectSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div :nth-child(1) .searchItemList>div"));
		
		for(int i=0;i<projectDropdownOption.size();i++) {
			
			WebElement option = projectDropdownOption.get(i);
			String name = option.getText();
			//System.out.println("Option name = " + name);
		
			if(name.equals("Android testing")) {
				option.click();
				break;
			}
		}
		
		
		WebElement text = driver.findElement(By.cssSelector("div.lightbox.taskProjectOrCustomerLightbox>div>div>div>div.innerContent>.tablePlaceholder>div>div>table>tbody>tr :nth-child(1)>.inputFieldWithPlaceholder"));
		text.click();
		text.sendKeys("kolar gold field");
		WebElement engText = driver.findElement(By.cssSelector("div.lightbox.taskProjectOrCustomerLightbox>div>div>div>div.innerContent>.tablePlaceholder>div>div>table>tbody>tr :nth-child(5)>div>.value.ellipsis"));
		engText.click();
		WebElement engTextField = driver.findElement(By.cssSelector("td>div>div>div>div.contentWrapper>div :nth-child(8)"));
		engTextField.click();
		driver.findElement(By.cssSelector("th.addToTTCell>div>label>.checkmark.checkMark")).click();
		driver.findElement(By.cssSelector("div.basicLightboxFooter>div :nth-child(3)>div>div.components_button_label")).click();
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
