package calender_Attribute_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class CSS_Location_Validation {

	public static void main(String[] args) {
		/*SeleniumUtility s2 = new SeleniumUtility();
		
		WebDriver driver = s2.setUp("chrome", "https://demo.actitime.com/login.do");
		
		/*
		 * Verify that password button come after username
		 * verify that signin button come after password
		 */
		
		SeleniumUtility s2 = new SeleniumUtility();
		
		WebDriver driver = s2.setUp("chrome", "https://www.google.com/");
		
		WebElement googleSearch = driver.findElement(By.cssSelector("input.gNO89b"));
		
		Point googleSearchLocation = googleSearch.getLocation();
		int googleSerchX = googleSearchLocation.getX();
		int googleSerchY = googleSearchLocation.getY();
		System.out.println("User Name X co-ordinate = "+ googleSerchX);
		System.out.println("user name Y co-ordinate = "+ googleSerchY);
		//String googleSearchFont = googleSearch.getCssValue("font-family");
		//String googleSearchFontColor = googleSearch.getCssValue("color");
		
		//System.out.println("google Search Font = "+googleSearchFont);
		//System.out.println("google Search Font Color = "+googleSearchFontColor);
		
		WebElement imLucky = driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc>center>input[class='RNmpXc']"));
		Point imLuckyLocation = imLucky.getLocation();
		int imLuckyX = imLuckyLocation.getX();
		int imLuckyY = imLuckyLocation.getY();
		System.out.println("im Lucky x co-ordinate = "+ imLuckyX);
		System.out.println("im Lucky Y co-ordinate = "+ imLuckyY);
		
		
		
		
		
		
	}

}
