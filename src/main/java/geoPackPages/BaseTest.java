package geoPackPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	//public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	public static WebDriver driver=null;
	Properties prop;
	//DesiredCapabilities dr=null;
	//@Parameters ({"browser"})
	@BeforeMethod (alwaysRun=true)
	
	public void initializeDriver () throws IOException, InterruptedException 
	{
		//
		prop = new Properties();
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{	
			//Below code for this machine
			
			
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
			  "\\chromedriver.exe");
			  
			  driver = new ChromeDriver(); 
			  driver.get(prop.getProperty("url"));
			 
			
			//Below code for remote machine
			
//			DesiredCapabilities dc = DesiredCapabilities.chrome();
//			
//			 driver = new RemoteWebDriver (new URL ("http://192.168.0.102:4444/wd/hub"),dc);
//			
//			 driver.get(prop.getProperty("url"));
//			
//			
//		
//		}
//		else if(browserName.equals("firefox"))
//		{
//			
//			//Below code for remote machine
//			DesiredCapabilities dc = DesiredCapabilities.firefox();
//			 driver = new RemoteWebDriver (new URL ("http://192.168.0.102:4444/wd/hub"),dc);
//			driver.get(prop.getProperty("url"));
//		 }
//		 //else if(browserName.equals("IE"))
//		 {
//			 
//			 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\IEDriverServer.exe");
//			   driver = new InternetExplorerDriver();
//			   driver.get(prop.getProperty("url"));
//		 }   
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	}
@AfterMethod (alwaysRun=true) 
public void tearDown() 
    {
	driver.quit();	
	}

}
