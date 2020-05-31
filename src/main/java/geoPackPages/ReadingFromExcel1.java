package geoPackPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel1  {
	
	public  ArrayList <String> getDataFromExcel (String TestCaseName ) throws IOException 
	{
		//File file = new File (System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestData2.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		
		ArrayList <String> arrayList = new ArrayList <String>();
		int noOfSheets = excel.getNumberOfSheets();
		for (int i=0;i<noOfSheets;i++) 
		{
			if (excel.getSheetName(i).equalsIgnoreCase("TestDataSheet"))
					{
						XSSFSheet sheet = excel.getSheetAt(i);
						
						Iterator <Row> row = sheet.iterator();
						Row firstRow = row.next();
						Iterator<Cell> cell = firstRow.cellIterator();
						
						int counter=0;
						int col=0;
						
						while (cell.hasNext()) 
						{
							Cell cellValue = cell.next();
							
							if (cellValue.getStringCellValue().equals("TestCase")) 
							{
							col = counter;
							break;
							}
							counter++;
						}
						
						System.out.println(col);
					
		
						while (row.hasNext()) 
						{
							Row secondRow = row.next();
							
							if (secondRow.getCell(col).getStringCellValue().equalsIgnoreCase(TestCaseName))
							{
								
								Iterator<Cell> secondRowCell = secondRow.cellIterator();
								while (secondRowCell.hasNext()) 
								{
								
									Cell cellValue1 = secondRowCell.next();
									
									if (cellValue1.getCellTypeEnum()==CellType.STRING) 
									{
										arrayList.add(cellValue1.getStringCellValue());
									}
							
									else 
									{
										arrayList.add(NumberToTextConverter.toText(cellValue1.getNumericCellValue()));
							}
							}
							
						}
								
					}
						
					}
		}
		return arrayList;
	}
public HashMap<String, String> verifyCartPageDetails (String planType) throws IOException 
{

	File file = new File (System.getProperty("user.dir")+ "\\src\\main\\java\\Resources\\TestData2.xlsx");
	FileInputStream fis = new FileInputStream (file);
	XSSFWorkbook excel = new XSSFWorkbook(fis);
	int noOfSheets = excel.getNumberOfSheets();
	HashMap <String,String> map = new HashMap <String,String> ();
	int k=0;
	
	for (int i=0;i<noOfSheets;i++) 
	{
		if (excel.getSheetName(i).equalsIgnoreCase("CartPage")) 
		{
			XSSFSheet sheet = excel.getSheetAt(i);
			Iterator <Row> itr = sheet.iterator();
			//Row firstRow = itr.next();
			
			while (itr.hasNext()) 
			{
				Row row = itr.next();
				Iterator <Cell> itc = row.cellIterator();
				Cell cell = itc.next();
				if (cell.getStringCellValue().equalsIgnoreCase(planType)) 
				{
					String planName = getPlanName(row,k,planType);
					map.put("PlanName", planName);
					
					String Words =  getNumberOfWords (row,k,planType);
					map.put("Words", Words);
					
					String noOfLicenses =  getNumberOfLicenses (row,k,planType);
					map.put("Licenses", noOfLicenses);
					
					String packageDetails =  getPackageDetails (row,k,planType);
					map.put("PackageDetails", packageDetails);
					
					String subTotal =  getSubTotal (row,k,planType);
					map.put("SubTotal", subTotal);
					
					String addLicenses = getNumberOfAddLicenses (row, k,planType);
					map.put("NumberOfAdditionalLicenses",addLicenses);
				}	
			}
			
			
			//Iterator <Cell> itc = firstRow.iterator();
//			while (itc.hasNext()) 
//			{
//				Cell cell = itc.next();
//				//String cellValue = cell.getStringCellValue();
//				if (cell.getCellTypeEnum()==CellType.STRING) 
//				{
//					list.add(cell.getStringCellValue());
//				}
//		
//				else 
//				{
//					list.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
//		        }
//			}
		}
	
		
	}
	
	return map;
	
    //System.out.println(list);
	//return list;
	
	
}
public String getPlanName(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String planName="";
	
	if (row.getCell(k+1).getCellTypeEnum()==CellType.STRING) 
	{
		planName = row.getCell(k+1).getStringCellValue();
		
	}
	else 
	{
		planName = NumberToTextConverter.toText(row.getCell(k+1).getNumericCellValue());
		
    }
	
	return planName;
	
}

public String getNumberOfWords(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String numberOfWords;
	
	if (row.getCell(k+2).getCellTypeEnum()==CellType.STRING) 
	{
		numberOfWords = row.getCell(k+2).getStringCellValue();
		
	}
	else 
	{
		numberOfWords = NumberToTextConverter.toText(row.getCell(k+2).getNumericCellValue());
		
    }
	
	return numberOfWords;
	
}

public String getNumberOfLicenses(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String numberOfLicenses;
	
	if (row.getCell(k+3).getCellTypeEnum()==CellType.STRING) 
	{
		numberOfLicenses = row.getCell(k+3).getStringCellValue();
		
	}
	else 
	{
		numberOfLicenses = NumberToTextConverter.toText(row.getCell(k+3).getNumericCellValue());	
    }
	return numberOfLicenses;
}

public String getPackageDetails(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String packageDetails;
	
	if (row.getCell(k+4).getCellTypeEnum()==CellType.STRING) 
	{
		packageDetails = row.getCell(k+4).getStringCellValue();
		
	}
	else 
	{
		packageDetails = NumberToTextConverter.toText(row.getCell(k+4).getNumericCellValue());
		
    }
	
	return packageDetails;
	
}

public String getSubTotal(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String subTotal;
	
	if (row.getCell(k+11).getCellTypeEnum()==CellType.STRING) 
	{
		subTotal = row.getCell(k+11).getStringCellValue();
		
	}
	else 
	{
		subTotal = NumberToTextConverter.toText(row.getCell(k+11).getNumericCellValue());
		
    }
	
	return subTotal;
	
}

public String getNumberOfAddLicenses(Row row, int k, String planType) {
	// TODO Auto-generated method stub
	
	String addLicenses;
	
	if (row.getCell(k+8).getCellTypeEnum()==CellType.STRING) 
	{
		addLicenses = row.getCell(k+8).getStringCellValue();
		
	}
	//else 
	//{
		addLicenses = NumberToTextConverter.toText(row.getCell(k+8).getNumericCellValue());
		//addLicenses = (int) row.getCell(k+8).getNumericCellValue();
    //}
	
	return addLicenses;
	
}
	

}

	
