package read_write_update_ExelSheet;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility01;
import read_write_update_ExelSheet.ExcelOperation;
public class UpdateExcelFile extends SeleniumUtility01  {

	@Test
	public void loginToActitime() {
		ExcelOperation ex = new ExcelOperation();
		String appUrl = ex.getCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet", 1	, 0);
		String username = ex.getCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet1", 1, 1);
		String password = ex.getCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet1", 1, 2);
		String expectedTitle = ex.getCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet1", 1, 3);
		System.out.println(appUrl);
		System.out.println(username);
		System.out.println(password);
		
		setUp("Chrome",appUrl);
		
		System.out.println("Actual title: "+getCurrentTitleOfApplication());
		
		if(getCurrentTitleOfApplication().equals(expectedTitle)) {
			ex.updateCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet1", 1, 4, "Pass");
			Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
					"Either login was not successfull or title got changed");
			
		}else{
			ex.updateCellValue(".\\src\\test\\resources\\XL-Sheet\\XL-02.xlsx", "Sheet1", 1, 4,"failed");
			Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
					"Either login was not successfull or title got changed");
		}
		
		
		cleanUp();
		
		
		
		
		
		
	}
	
	
	
}
