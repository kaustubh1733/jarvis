package locators_multiLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver chrom =  new ChromeDriver();
		
		//google url
		chrom.get("https://www.google.com/");
		
		//get Source code
		String Sourcecode = chrom.getPageSource();
		
		System.out.println(Sourcecode);
		System.out.println(Sourcecode.length());
		
		//get current URL from Browser
		
		System.out.println("Current url : " + chrom.getCurrentUrl());
		
		//get current page Title
		
		System.out.println("Title : "+ chrom.getTitle());
		if(chrom.getTitle().equals("Google")) {
			System.out.println("Google search page opened successfully...");
		}else {
			System.out.println("Either google search page not opened or its title got changed");
		}
		
		//close the browser
		
		chrom.close();
		
		
		
		
		

	}

}
