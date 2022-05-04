package frame_windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Window_Handling {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://etrain.info/in");
		
		//get current window unique ID
		String homePageWindow = driver.getWindowHandle();
		System.out.println("Home Page Window ID: "+homePageWindow);
		
		
		//performing click operation ro open LinkedIn oage in new tab
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/trippozo']//i")).click();
		
		//get all windows ID which are opened by selenium instance
		Set<String> allWinds = driver.getWindowHandles();
		System.out.println("All Windows ID = "+ allWinds);
		
		//remove home id from all window then you wil get child window
		allWinds.remove(homePageWindow);
		System.out.println("After remoing homeWinID, all windows ID: " + allWinds);
		
		//get child window Id from Iterator
		Iterator<String> itr = allWinds.iterator();
		String childWindow = itr.next();
		
		//Switch to child window
		driver.switchTo().window(allWinds.iterator().next());
				//or
		driver.switchTo().window(childWindow);
		
		
		//now you are in child window
		System.out.println("child page title: "+driver.getTitle());
		System.out.println(("child page url: "+ driver.getCurrentUrl()));
		
		

		// close current instance of browser
		 driver.close();
		//driver.quit();//comment below code
		 
		 
		 //switch bavk to home page window in order to perform required operations
		 
		 driver.switchTo().window(homePageWindow);
		 
		 System.out.println("etrain page title: " + driver.getTitle());
		System.out.println("etrain page ulr: " + driver.getCurrentUrl());
		// close current instance of browser
		 driver.close();
		 // close all the driver instances opened by webdriver
		//driver.quit();
		
		
		
		
		
		
		
	}

}
