package geoPackTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import geoPackPages.BaseTest;
import geoPackPages.CartPage;
import geoPackPages.HomePage;
import geoPackPages.OurPlansPage;
import geoPackPages.ReadingFromExcel1;
import geoPackPages.UtilityFunctions;

public class AgencyTest extends BaseTest {
	
	static ReadingFromExcel1 rfe ;
	static OurPlansPage opp;
	
	public static int getValueFromExcel () throws IOException 
	{
		opp = new OurPlansPage ();
		String planType = opp.getPlanType();
		rfe = new ReadingFromExcel1();
		HashMap <String,String> map = rfe.verifyCartPageDetails(planType);
		String noOfAddLicenses = map.get("NumberOfAdditionalLicenses");
		int noOfAddLicensesInt = Integer.parseInt(noOfAddLicenses);
		return noOfAddLicensesInt;
	}
	
	@Test (groups= {"Smoke", "Regression"} , priority=1)
	public void AgencyMonthly10000SmallestNoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=2)
	public void AgencyMonthly10000SmallestWithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=3)
	public void AgencyAnnually10000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=4)
	public void AgencyAnnually10000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=5)
	public void AgencyMonthly20000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=6)
	public void AgencyMonthly20000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=7)
	public void AgencyAnnually20000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=8)
	public void AgencyAnnually20000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=9)
	public void AgencyMonthly80000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=10)
	public void AgencyMonthly80000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Smoke", "Regression"} , priority=11)
	public void AgencyAnnually80000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=12)
	public void AgencyAnnually80000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}

	@Test (groups= {"Regression"} , priority=13)
	public void AgencyMonthly160000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=14)
	public void AgencyMonthly160000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=15)
	public void AgencyAnnually160000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=16)
	public void AgencyAnnually160000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	@Test (groups= {"Regression"} , priority=17)
	public void AgencyMonthly240000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=18)
	public void AgencyMonthly240000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=19)
	public void AgencyAnnually240000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=20)
	public void AgencyAnnually240000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	@Test (groups= {"Regression"} , priority=21)
	public void AgencyMonthly350000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Smoke","Regression"} , priority=22)
	public void AgencyMonthly350000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=23)
	public void AgencyAnnually350000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=24)
	public void AgencyAnnually350000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}

	@Test (groups= {"Regression"} , priority=25)
	public void AgencyMonthly500000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=26)
	public void AgencyMonthly500000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=27)
	public void AgencyAnnually500000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=28)
	public void AgencyAnnually500000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}

	@Test (groups= {"Regression"} , priority=29)
	public void AgencyMonthly750000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=30)
	public void AgencyMonthly750000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=31)
	public void AgencyAnnually750000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Smoke","Regression"} , priority=32)
	public void AgencyAnnually750000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=33)
	public void AgencyMonthly1000000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=34)
	public void AgencyMonthly1000000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=35)
	public void AgencyAnnually1000000NoExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithoutExtSupportAgency(noOfAddLicenses);
	}
	
	@Test (groups= {"Regression"} , priority=36)
	public void AgencyAnnually1000000WithExtSupport() throws InterruptedException, IOException 
	{
		int noOfAddLicenses = getValueFromExcel();
		UtilityFunctions.checkoutProcessWithExtSupportAgency(noOfAddLicenses);
	}
//@BeforeClass
	
public void launchApplication() throws IOException 
	{
Properties prop = new Properties();
FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
prop.load(fis);
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
//driver=new RemoteWebDriver(new    URL("http://192.168.0.103:4444/wd/hub"), dr);
driver = new ChromeDriver();
driver.get(prop.getProperty("url"));
driver.get("https://www.geoworkz.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
//
//	//@AfterClass
//	public void closeApplication() 
//	{
//		driver.close();
//	}
//	
}
