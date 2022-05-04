package keyboard_Mouse_Operation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class Mouse_Assignment {

	public static void main(String[] args)  {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.sendKeys("Tony Stark",Keys.chord(Keys.CONTROL,"a"));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("Ney York, STARK building",Keys.PAGE_DOWN);
		
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("stark@Avengers.com",Keys.TAB,Keys.PAGE_DOWN);
		
		driver.switchTo().activeElement().sendKeys("002-568-57-876");
		
		driver.findElement(By.cssSelector("div.form-group>div.col-md-4>label>input[value='Male']")).click();
		
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		
		
		//language
		
		WebElement language = driver.findElement(By.id("msdd"));
		language.click();
		List<WebElement> langOption = driver.findElements(By.cssSelector("ul[style='list-style:none;max-height: 230px;overflow: scroll;']>li"));
		for(int i=0;i<langOption.size();i++) {
			WebElement op1 = langOption.get(i);
			String nam = op1.getText();
			System.out.println(nam);
			if(nam.equalsIgnoreCase("English")) {
				System.out.println(nam);
				op1.click();
				break;
			}
		}
		
		//langOption.get(5).click();
		
		//Skill
		
		WebElement skillDropdown = driver.findElement(By.cssSelector("#Skills"));
		skillDropdown.sendKeys(Keys.PAGE_DOWN);
		Select selectSkill = new Select(skillDropdown);
		List<WebElement> skillOption = driver.findElements(By.cssSelector("#Skills>option"));
		for(int i=0;i<skillOption.size();i++) {
			WebElement op = skillOption.get(i);
			String name2 = op.getText();
			System.out.println(name2);
			if(name2.equalsIgnoreCase("Java")) {
				System.out.println(name2);
				op.click();
				break;
			}
		}
		
		
		
		//selectSkill.selectByValue("Java");
		
		
		
		//select Country
		WebElement selectCountryDropdown = driver.findElement(By.cssSelector("select#country"));
		
		Select selectCountry = new Select(selectCountryDropdown);
		List<WebElement> countryOption = driver.findElements(By.cssSelector("select#country>option"));
		for(int i=0;i<countryOption.size();i++) {
			System.out.println("country option count = "+ countryOption.size());
			
			if(countryOption.get(i).getText().equalsIgnoreCase("India")) {
				System.out.println("Selected Country = "+ countryOption.get(i).getText());
				countryOption.get(i).click();
				break;
			}
		}
				
		
		//date of birth
		
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		Select selectYear = new Select(yearDropdown);
		
		List<WebElement> yearOption = driver.findElements(By.cssSelector("#yearbox>option"));
		System.out.println("Year option count = "+ yearOption.size());
		
		selectYear.selectByValue("1989");
		
		WebElement monthDropdown = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select selectMonth = new Select(monthDropdown);
		//List<WebElement> monthOption= driver.findElements(By.cssSelector("select[placeholder='Month']>option"));
		//System.out.println("month count = "+ monthOption.size());
		selectMonth.selectByIndex(2);
	
		
		
		WebElement dayDropdown = driver.findElement(By.cssSelector("#daybox"));
		Select selectDay = new Select(dayDropdown);
		//List<WebElement> dayOption = driver.findElements(By.cssSelector("#daybox>option"));
		//System.out.println("days count = "+ dayOption.size());
		selectDay.selectByValue("5");
		
		
		
		//password
		WebElement password =  driver.findElement(By.id("firstpassword"));
		password.sendKeys("123456789",Keys.chord(Keys.CONTROL,"a"));
		password.sendKeys(Keys.TAB);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.switchTo().activeElement()).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
	}

}
