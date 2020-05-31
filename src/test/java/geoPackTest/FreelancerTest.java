package geoPackTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import geoPackPages.UtilityFunctions;

public class FreelancerTest extends BaseTest {

	@Test (groups= {"Smoke","Regression"}, priority=1)
	public void FreelancerMonthly5000NoExtSupport() throws InterruptedException 
	{
		
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=2)
	public void FreelancerMonthly5000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
		
	}
	
	@Test (groups= {"Regression"}, priority=3)
	public void FreelancerAnnually5000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=4)
	public void FreelancerAnnually5000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	

	@Test (groups= {"Regression"}, priority=5)
	public void FreelancerMonthly30000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test  (groups= {"Regression"}, priority=6)
	public void FreelancerMonthly30000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	
	
	@Test (groups= {"Regression"}, priority=7)
	public void FreelancerAnnually30000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=8)
	public void FreelancerAnnually30000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=9)
	public void FreelancerMonthly50000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=10)
	public void FreelancerMonthly50000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	
	@Test (groups= {"Smoke","Regression"}, priority=11)
	public void FreelancerAnnually50000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=12)
	public void FreelancerAnnually50000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=13)
	public void FreelancerMonthly80000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=14)
	public void FreelancerMonthly80000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
	}
	
	@Test (groups= {"Regression"}, priority=15)
	public void FreelancerAnnually80000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupport();
	}
	
	@Test (groups= {"Smoke","Regression"}, priority=16
			)
	public void FreelancerAnnually80000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupport();
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
