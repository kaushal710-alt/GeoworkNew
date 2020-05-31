package geoPackTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class EnterPrizeTest extends BaseTest {
	
	private static Logger log = LogManager.getLogger(EnterPrizeTest.class.getName());
	
	@Test (groups= {"Regression"} , priority=1)
	public void EnterprizeMonthly10000SmallestNA() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonEnterPrize(planType);
	}
	
	
	@Test (groups= {"Smoke", "Regression"} , priority=2)
	public void EnterprizeAnnually10000SmallestNoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=3)
	public void EnterprizeAnnually10000SmallestWithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	

	@Test (groups= {"Regression"} , priority=4)
	public void EnterprizeMonthly250000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test  (groups= {"Regression"} , priority=5)
	public void EnterprizeMonthly250000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	
	
	@Test (groups= {"Regression"} , priority=6)
	public void EnterprizeAnnually250000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=7)
	public void EnterprizeAnnually250000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=8)
	public void EnterprizeMonthly500000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=9)
	public void EnterprizeMonthly500000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=10)
	public void EnterprizeAnnually500000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Smoke" ,"Regression"} , priority=11)
	public void EnterprizeAnnually500000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=12)
	public void EnterprizeMonthly1000000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=13)
	public void EnterprizeMonthly1000000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=14)
	public void EnterprizeAnnually1000000NoExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithoutExtSupportEnterPrize();
	}
	
	@Test (groups= {"Regression"} , priority=15)
	public void EnterprizeAnnually1000000WithExtSupport() throws InterruptedException 
	{
		UtilityFunctions.checkoutProcessWithExtSupportEnterPrize();
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
