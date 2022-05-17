package ExtentReport01;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility01;

public class Extent01 extends SeleniumUtility01{
	static ExtentTest test; 
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\ExtentReport\\Extent01.html");
		test = report.startTest("Google Report");
	}
	
	
	@Test
	public void extentReportDemo() throws IOException {
		WebDriver driver = setUp("Chrome","https://www.google.com");
		if(driver.getTitle().equals("Googlw1")) {
			test.log(LogStatus.PASS,"Navigated to the specified URL successfully and page tile is also validated");
			System.out.println("Navigated to the specified URL successfully and page tile is also validated");
		}else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshot(driver)),"Google page validation got fail");
		}
		
		cleanUp();
		
	}
	
	@AfterClass
	public  static void endTest() {
		report.endTest(test);
		report.flush();
	}
	
	
	public static String screenshot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ExtentReport\\screenshots\\screenshot"+System.currentTimeMillis()+".png");
		String errflpath = dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, dest);
		return errflpath;
		
		
	}
	
	
	
	
}
