package read_write_update_ExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XlSheet01 {
	@Test(priority = 1)
	public void performOperationOnSheet() throws IOException {
		
		//find path and name of excel file
		FileInputStream fil1 = new FileInputStream(".\\src\\test\\resources\\XL-Sheet\\XL-01.xlsx");
		
		
		//create instance of workbook class
		Workbook workbook = new XSSFWorkbook(fil1);
		
		/*perform required operation on sheet*/
		
		//get sheet count 
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("no of sheets : "+ sheetCount);
		
		//get sheet names
		
		//String sheetName=workbook.getSheetName(0);
		
		for(int i=0;i<sheetCount;i++) {
			System.out.println("sheet name :"+ workbook.getSheetName(i));
		}
		
	}

	@Test(priority =2)
	public void getRowDetails() throws IOException {
		FileInputStream fis2 = new FileInputStream(".\\src\\test\\resources\\XL-Sheet\\XL-01.xlsx");
		
		Workbook workbook = new XSSFWorkbook(fis2);
		
		// get sheet info 
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//Row info
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Numbers of rows in 1 sheet = "+ rowCount);	//Shows actual-1
		
		
		//for specific row
		
		//XSSFRow row = sheet.getRow(1);
		
		Row row = sheet.getRow(2);
		
	}
	
	
	
	@Test(priority=3)
	public void getCellCount() throws IOException {
		
		FileInputStream fis3 = new FileInputStream(".\\src\\test\\resources\\XL-Sheet\\XL-01.xlsx");
		
		Workbook workbook = new XSSFWorkbook(fis3);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//for perticular row
		Row row = sheet.getRow(1);
		
		//cell info
		int cellCount = row.getLastCellNum();
		System.out.println("cell count in row 1 = "+ cellCount);
		
		//get cell
		Cell cell = row.getCell(2);
		
		//get value from cell
		String cellValue = cell.getStringCellValue();
		System.out.println("2nd cell value of row 1 ="+cellValue);
		
		//get all cell values
		for(int i=0;i<cellCount;i++) {
			System.out.println(row.getCell(i).getStringCellValue());
		}

		
	}
	
	@Test(priority = 4)
	public void updateExcel() throws IOException  {
		
		FileInputStream fis4 = null;
		try {
			fis4 = new FileInputStream(".\\src\\test\\resources\\XL-Sheet\\XL-01.xlsx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Workbook workbook = new XSSFWorkbook(fis4);
		
		
		Sheet sheet = workbook.getSheet("Sheet1");
		//perticular row
		Row row = sheet.getRow(1);
		row.createCell(4).setCellValue("passed");
		
		//identify the location where you wan to save your new file
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\XL-Sheet\\XL-01.xlsx");
		
		//write your content into your excel file
		workbook.write(fos);
		
		//flush the content from stream to excel file
		fos.flush();
		//close the stream to save data
		fos.close();
		System.out.println("Excel Updated");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
