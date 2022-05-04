package calender_Attribute_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class CSS_Atribute_Validations {

	public static void main(String[] args) {
		SeleniumUtility s2 = new SeleniumUtility();
		
		WebDriver driver = s2.setUp("chrome", "https://www.google.com/");
		
		WebElement googleSearch = driver.findElement(By.cssSelector("input.gNO89b"));
		String googleSearchFont = googleSearch.getCssValue("font-family");
		String googleSearchFontColor = googleSearch.getCssValue("color");
		
		System.out.println("google Search Font = "+googleSearchFont);
		System.out.println("google Search Font Color = "+googleSearchFontColor);
		
		
		
		

	}

}
