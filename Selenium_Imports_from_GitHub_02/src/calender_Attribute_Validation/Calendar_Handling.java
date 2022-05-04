package calender_Attribute_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Calendar_Handling {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.makemytrip.com/");
		//close login popup
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		Thread.sleep(2500);
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(2500);
		//select any date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();


	}

}
