package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Custom_03 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		WebElement button = dr.findElement(By.cssSelector("#bsd1-button"));
		button.click();
		
		//identify all the option and store them into a list<WebElement>
		List<WebElement> option = dr.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		
		System.out.println("option count = "+ option.size());
		
		for(int i=0;i<option.size();i++) {
			System.out.println("Option"+i+"="+option.get(i).getText());			
		}
		
		option.get(2).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
