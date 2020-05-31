package geoPackPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel_oldMethod  {
	
	public  HashMap<String, String> getDataFromExcel () throws IOException 
	{
		File file = new File (System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream (file);
		
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		XSSFSheet sheet = excel.getSheet("TestDataSheet");
		Iterator <Row> row = sheet.iterator();
		Row firstRow = row.next();  // This will take the control to first row
		Iterator <Cell> cell = firstRow.cellIterator();
		int i=0;
		//String cellValue1 = "";
		HashMap <String,String> map = new HashMap <String,String> ();
		while (cell.hasNext()) 
		{
			Cell CellControl = cell.next();
			String valueCell = CellControl.getStringCellValue();
			if (valueCell.equalsIgnoreCase("UserName")) 
			{
				Row secondRow =row.next();
				String cellValue1 = secondRow.getCell(i).getStringCellValue();
				map.put("UserName", cellValue1);
				String cellValue2 = secondRow.getCell(i+1).getStringCellValue();
				map.put("Password", cellValue2);
				String cellValue3 = secondRow.getCell(i+2).getStringCellValue();
				map.put("RetypePassword", cellValue3);
				String cellValue4 = secondRow.getCell(i+3).getStringCellValue();
				map.put("Tenancy", cellValue4);
				String cellValue5 = secondRow.getCell(i+4).getStringCellValue();
				map.put("First Name", cellValue5);
				String cellValue6 = secondRow.getCell(i+5).getStringCellValue();
				map.put("Last Name", cellValue6);
				String cellValue7 = secondRow.getCell(i+6).getStringCellValue();
				map.put("Email", cellValue7);
				String cellValue8 = secondRow.getCell(i+7).getStringCellValue();
				map.put("Address", cellValue8);
				String cellValue9 = secondRow.getCell(i+8).getStringCellValue();
				map.put("City", cellValue9);
				String cellValue10 = secondRow.getCell(i+9).getStringCellValue();
				map.put("Zip Code", cellValue10);
				String cellValue11 = secondRow.getCell(i+10).getStringCellValue();
				map.put("Phone", cellValue11);
				//System.out.println(cellValue1);
				//return cellValue1;			
			break;
			}
			i++;
		}
		return map;
	}
}
