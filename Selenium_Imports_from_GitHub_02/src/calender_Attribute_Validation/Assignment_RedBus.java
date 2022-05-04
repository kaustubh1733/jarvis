package calender_Attribute_Validation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class Assignment_RedBus {

	public static void main(String[] args) {
		
		
		SeleniumUtility s2 = new SeleniumUtility();
		
		WebDriver driver = s2.setUp("chrome", "https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("input#src")).sendKeys("Swargate, Pune");
		driver.findElement(By.cssSelector("li[data-id='67159']")).click();
		
		driver.findElement(By.cssSelector("input#dest")).sendKeys("Panjim, Goa");
		driver.findElement(By.cssSelector("li[data-id='76065']")).click();
		
		driver.findElement(By.cssSelector("#onward_cal")).click();
		driver.findElement(By.cssSelector("td.next")).click();
		
		driver.findElement(By.cssSelector("tbody>:nth-child(5)>td:nth-child(2)")).click();
		
		WebElement search = driver.findElement(By.cssSelector("#search_btn"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		
		driver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li:nth-child(4)>.custom-checkbox")).click();
		driver.findElement(By.cssSelector("label[title=AC]")).click();
		
		
		List<WebElement> busName = driver.findElements(By.cssSelector("ul.bus-items>div>li :nth-child(2) .column-two.p-right-10.w-30.fl"));
		List<WebElement> busPrice = driver.findElements(By.cssSelector("ul.bus-items>div>li :nth-child(6)>.seat-fare >.fare.d-block"));
		
		
		
		for(int i=0;i<busName.size();i++) {
			for(int j=0;j<busPrice.size();j++) {
				WebElement option = busName.get(i);
				String bus = option.getText();
				WebElement option1 = busPrice.get(j);
				String busFare = option1.getText();
				System.out.println("bus name. :"+bus);
				System.out.println("bus fares = "+busFare);
				System.out.println("*********Next Bus*************");
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
