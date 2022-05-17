package read_write_update_ExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOperation {
	
	
	@Test
	public String getCellValue(String path, String sheetName, int rowNum, int cellNum) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		/*
		 * Switch  case to check cell type and read content accordingly
		 */
		
		switch(row.getCell(cellNum).getCellType()) {
		
		case Cell.CELL_TYPE_STRING:
			return row.getCell(cellNum).getStringCellValue();
		case Cell.CELL_TYPE_NUMERIC:
			return ""+(int) row.getCell(cellNum).getNumericCellValue();
		default :
			return null;
		}
	
	}
	
	
	
	public void updateCellValue(String path, String sheetName, int rowNum, int cellNum, String input) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		row.createCell(cellNum).setCellValue(input);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			workbook.write(fos);
			fos.flush();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
