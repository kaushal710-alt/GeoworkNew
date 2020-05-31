package geoPackTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import geoPackPages.BaseTest;
import geoPackPages.CartPage;
import geoPackPages.CheckOutFormPage;
import geoPackPages.HomePage;
import geoPackPages.OurPlansPage;

public class ProductTest extends BaseTest{
	
	private static Logger log = LogManager.getLogger(ProductTest.class.getName());
	@Test
	public void checkoutProcess() throws InterruptedException, IOException {
	HomePage home = new HomePage(driver);
	home.clickOurPlansButton();
	
	OurPlansPage opp = new OurPlansPage ();
	opp.clickSignUpButton();
	
	CartPage cpage = new CartPage();
	cpage.getPlanDetails();
	Thread.sleep(5000);
	cpage.clickCheckoutButton();
	
	
	CheckOutFormPage cofp =new CheckOutFormPage ();
	cofp.fillTheFormPage();
	
	/*ReadingFromExcel rfe = new ReadingFromExcel ();
	HashMap<String, String> username123=rfe.getDataFromExcel();
	String username1 = username123.get("UserName");
	String password2 = username123.get("Password");
	String password3 = username123.get("RetypePassword");
	String Tenancy = username123.get("Tenancy");
	String firstName = username123.get("First Name");
	String lastName = username123.get("Last Name");
	String email = username123.get("Email");
	String address = username123.get("Address");
	String city = username123.get("City");
	String zipCode = username123.get("Zip Code");
	String phone = username123.get("Phone");
	driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(username1);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password2);
	driver.findElement(By.xpath("//input[@id='CPassword']")).sendKeys(password3);
	driver.findElement(By.xpath("//input[@id='TenancyName']")).sendKeys(Tenancy);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys(address);
	driver.findElement(By.xpath("//input[@id='City']")).sendKeys(city);
	driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys(zipCode);
	driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(phone);*/
	
	}
	
@BeforeClass
	
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

	@AfterClass
	public void closeApplication() 
	{
		driver.close();
}
	
}
