package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("http://demo.automationtesting.in/Register.html");
		
		
		WebElement skillDropdown = dr.findElement(By.id("Skills"));
		
		//create an instance of current class and pass out webelement into constructor of select class 
		
		Select selectSkill = new Select(skillDropdown);
		
		//check dropdown is multiselect or not 
		System.out.println("is multiselect dropdown = "+ selectSkill.isMultiple());
		
		//get default or already select option
		
		WebElement selectedOption = selectSkill.getFirstSelectedOption();
		String selectedOptionName = selectedOption.getText();
		System.out.println("already selected option name = "+ selectedOptionName);
		//**or
		System.out.println("Already selected option name = "+ selectSkill.getFirstSelectedOption().getText());
		
		
		
		//get option count 
		
		List<WebElement> option = selectSkill.getOptions();
		
		System.out.println("dropdown count = "+ option.size());
		//get dropdown option name
		for(int i=0;i<option.size();i++) {
			System.out.println("option" + i+ ": "+option.get(i).getText() );
		}
		
		//option selection
		
		selectSkill.selectByIndex(2);
				//or
		selectSkill.selectByValue("Backup Management");
				//or
		selectSkill.selectByVisibleText("Analytics");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
