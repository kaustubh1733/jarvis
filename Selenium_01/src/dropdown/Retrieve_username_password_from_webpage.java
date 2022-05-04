package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrieve_username_password_from_webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		dr.get("https://opensource-demo.orangehrmlive.com/");
		
		String credintial = dr.findElement(By.tagName("span")).getText();
		System.out.println("login credintial = "+ credintial);
		
		String[] loginDetails = credintial.split(" ");
		
		/*
		dr.findElement(By.id("txtUsername")).sendKeys(loginDetails[3]);
		dr.findElement(By.id("txtPassword")).sendKeys(loginDetails[7]);
		dr.findElement(By.id("btnLogin")).click();
		*/
		
		credintial = credintial.replace("( Username : ","");
		credintial = credintial.replace(" | Password : ", " ");
		credintial = credintial.replace(" )","");
		System.out.println(credintial);
		
		String[] login = credintial.split(" ");
		dr.findElement(By.id("txtUsername")).sendKeys(login[0]);
		dr.findElement(By.id("txtPassword")).sendKeys(login[1]);
		dr.findElement(By.id("btnLogin")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
