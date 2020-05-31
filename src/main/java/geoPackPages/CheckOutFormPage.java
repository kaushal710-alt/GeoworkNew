package geoPackPages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class CheckOutFormPage extends BaseTest{
	
	public void fillTheFormPage () throws IOException {
		
		ReadingFromExcel1 rfe = new ReadingFromExcel1 ();
		ArrayList <String> a=rfe.getDataFromExcel("Signup");
		
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(a.get(1));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(a.get(2));
		driver.findElement(By.xpath("//input[@id='CPassword']")).sendKeys(a.get(3));
		driver.findElement(By.xpath("//input[@id='TenancyName']")).sendKeys(a.get(4));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(a.get(5));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(a.get(6));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(a.get(7));
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys(a.get(8));
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys(a.get(9));
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys(a.get(10));
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(a.get(11));
		
		
		
	}
	
	
	

}
