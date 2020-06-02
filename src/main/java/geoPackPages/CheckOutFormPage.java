package geoPackPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;

public class CheckOutFormPage extends BaseTest{
	
	By subAgreement = By.id("common-checkbox-1");
	By submit = By.xpath("//button[@id='btnSubmit']");
	By subAgreement2 = By.id("common-checkbox-2");
	By scrollup = By.xpath("//div[@class='scrollup']");
	
	public void checkSubscriptionCheckbox () 
	{
		driver.findElement(subAgreement).click();
	}
	
	public void checkSubscriptionCheckbox1 () 
	{
		driver.findElement(scrollup).click();
		driver.findElement(subAgreement2).click();
	}
	
	public void clickSubmitButton () 
	{
		driver.findElement(submit).click();
	}
	
	public void fillTheFormPage () throws IOException {
		
		ReadingFromExcel1 rfe = new ReadingFromExcel1 ();
		HashMap <String , String> map = rfe.userDetailsForm();
		
		
		Random r = new Random ();
		int num = r.nextInt(1000);
		String numRandom = Integer.toString(num);
		
		String username = map.get("UserName") + numRandom;
		String password = map.get("Password") + numRandom;
		String repassword = map.get("ReTypePassword") + numRandom;
		String tenancy = map.get("Tenancy") + numRandom;
		String fname = map.get("FirstName") + numRandom;
		String lname = map.get("LastName") + numRandom;
		String email = numRandom+map.get("Email Address") ;
		String address = map.get("Address");
		String city = map.get("City");
		String zipcode = map.get("ZipCode");
		String phone = map.get("Phone");
		
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='CPassword']")).sendKeys(repassword);
		driver.findElement(By.xpath("//input[@id='TenancyName']")).sendKeys(tenancy);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(phone);
	}
}
