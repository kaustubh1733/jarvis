package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown_Facebook_Assignment01 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("https://www.facebook.com/");
		
		WebElement create = dr.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		
		WebElement date = dr.findElement(By.cssSelector("select#day"));
		
		Select dateSelect = new Select(date);
		System.out.println("is multiselect dropdown = "+ dateSelect.isMultiple());
		
		WebElement selectedOption = dateSelect.getFirstSelectedOption();
		String selectedOptionDate = selectedOption.getText();
		System.out.println("default selected option date= "+ selectedOptionDate);
		//or
		System.out.println("option date = "+ dateSelect.getFirstSelectedOption().getText());
		
		
		List<WebElement> dateOption = dateSelect.getOptions();
		System.out.println("date option count = "+ dateOption.size());
		
		for(int i=0;i<dateOption.size();i++) {
			System.out.println("Dates: "+dateOption.get(i).getText());
		}
		
		
		//dateSelect.selectByIndex(16);
		dateSelect.selectByValue("17");
		
		
		
		WebElement month = dr.findElement(By.cssSelector("#month"));
		
		Select monthSelect = new Select(month);
		
		WebElement selectedOption1 = monthSelect.getFirstSelectedOption();
		String selectedOptionMonth = selectedOption1.getText();
		System.out.println("default selected month - "+ selectedOptionMonth);
		
		
		
		List<WebElement> monthOption = monthSelect.getOptions();
		System.out.println("month count = "+monthOption.size());
		
		for(int i=0;i<monthOption.size();i++) {
			System.out.println("month"+i+" : "+monthOption.get(i).getText());
			
		}
		
		monthSelect.selectByIndex(2);
		Thread.sleep(2000);
		monthSelect.selectByVisibleText("Dec");
		
		
		WebElement year = dr.findElement(By.cssSelector("#year"));
		Select yearSelect = new Select(year);
		
		WebElement selectedYear = yearSelect.getFirstSelectedOption();
		String selectedYearOption = selectedYear.getText();
		System.out.println("selected default year= "+ selectedYearOption);
		
		List<WebElement> yearOption = yearSelect.getOptions();
		System.out.println("Year Count = "+ yearOption.size());
		
		for(int i=0;i<yearOption.size();i++) {
			System.out.println("Year"+i+" : "+yearOption.get(i).getText());
		}
		
		
		yearSelect.selectByValue("1997");
		
	
		
		
		
		
		
		
	}

}
