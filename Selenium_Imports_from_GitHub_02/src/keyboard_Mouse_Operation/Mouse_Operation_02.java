package keyboard_Mouse_Operation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Mouse_Operation_02 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.globalsqa.com/demo-site/");
		
		//identify the element of main menue
		
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("main menu count = "+ mainMenu.size());
		
		//create yhe instance of actions class and pass the browser driver to its constructor
		Actions act = new Actions(driver);
		
	/*	for(int i=0;i<mainMenu.size();i++) {
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			try {
				Thread.sleep(1800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
		}
		
		*/
		
		
		//mouseHover(act , mainMenu);
		
		
		//mouseHoverWithCords(act,mainMenu.get(1));
		
		
		rightClick(act,mainMenu.get(1));
		
		
	
	}

	
	
		static void mouseHover(Actions act, List<WebElement> mainMenu)  {
			for(int i=0;i<mainMenu.size();i++) {
				WebElement option=mainMenu.get(i);
				act.moveToElement(option).perform();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
		}
	
	
		
		
		static void mouseHoverWithCords(Actions act, WebElement option) {
			System.out.println("Optoin name is : "+option.getText());
			act.moveToElement(option, 100,0).perform();
		}
	
	
	
		static void rightClick(Actions act , WebElement option) {
			System.out.println("Option name = "+ option.getText());
			act.moveToElement(option).contextClick().build().perform();
			
		}
		
		
	
}
