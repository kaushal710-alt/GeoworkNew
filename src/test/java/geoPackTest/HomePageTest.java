package geoPackTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import geoPackPages.BaseTest;
import geoPackPages.HomePage;
import geoPackPages.ReadingFromExcel1;
import junit.framework.Assert;

public class HomePageTest {
	
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	HomePage home;
	public void initializeHomepage () 
	{
		//home = new HomePage(driver);
	}
	//@Test
	public void logoValidation () 
	{
		initializeHomepage ();
	    home.getLogoPresence(); 
	    
	    
	}
    //@Test
	public void HomeLinkValidation () 
	{
    	initializeHomepage ();
	    home.getHomeLinkPresence();
	    
	}
    
    //@Test
   	public void SupportLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getSupportLinkPresence();
   	
   	}
    public void ProductLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getProductLinkPresence();
   	}
    public void ContactLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getContactLinkPresence();
   	}
    
	@Test
	public void testing () throws IOException 
	{
		ReadingFromExcel1 rfe = new ReadingFromExcel1 ();
		String planType = "AgencyMonthly10000SmallestNoExtSupport";
		HashMap<String, String> list1 = rfe.verifyCartPageDetails(planType);
		System.out.println(list1);
		
		
	}
    //@AfterClass
	public void closeApplication() 
	{
		//driver.close();
	}
	 
}
