package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		d.get("https://www.flipkart.com/");
		d.findElement(By.cssSelector("div>div>div>button._2KpZ6l")).click();
		
		List<WebElement> all = d.findElements(By.cssSelector("._37M3Pb>div"));
		System.out.println("total elements = "+ all);
		
		for(int i=0;i<all.size();i++) {
			
			WebElement option = all.get(i);
			String name = option.getText();
			System.out.print(name+" ");
			
		}
		
		
		
		
		
		
		

	}

}
