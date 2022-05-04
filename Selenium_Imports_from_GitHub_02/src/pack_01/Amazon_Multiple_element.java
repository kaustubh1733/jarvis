package pack_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_Multiple_element {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		d.get("https://www.amazon.in/");

		List<WebElement> allOption=d.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("total elements = " + allOption);
		for (int i = 0; i < allOption.size(); i++) {
			WebElement option = allOption.get(i);
			String name = option.getText();
			System.out.println("Option name = " + name);
			if (name.equals("Amazon Pay")) {
				option.click();
				break;

			} else {
				System.out.println("Not matched.....");

			}

		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		d.navigate().back();
		
		
		
		

	}

}
