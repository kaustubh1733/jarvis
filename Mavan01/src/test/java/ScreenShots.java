import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
public class ScreenShots {
	@Test
	
	public void screenShots() {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.google.com");
		// downcast the driver to access TakesScreenshot method
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//capture screenshot as output file
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		// capture screenshot as output type FILE
		try {
			//save screenshots in destination path
			FileUtils.copyFile(file,new File(".\\src\\test\\resources\\screen"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	

}
