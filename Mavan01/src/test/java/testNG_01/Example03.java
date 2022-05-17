package testNG_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example03 {

	@Test
	public void tc3() {
		displayDetails();
		System.out.println("Hello, i am from tc3");
		System.setProperty("webdriver.chrome.driver", ".executables\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		
	}
	
	@Test
	public void tc4() {
		System.out.println("Hello, I am from tc 4");
		displayDetails();
	}
	
	public void displayDetails() {
		System.out.println("Hello, I am displayDetails method from  tc4");
		
	}
	
	/**
	if testng class contains more dn one test method dn all the test method will be executed in
	alphabetical order
	*/
}
