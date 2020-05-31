package geoPackPages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class HomePage{
	
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	WebDriver driver;
	public HomePage (WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By logo = By.xpath("//img[@class='logo']");
	By Home = By.id("menuHome");
	By Support = By.cssSelector("a[id='menuSupport']");
	By Product = By.cssSelector("a[id='menuProduct']");
	By Contact = By.cssSelector("a[id='menuContact']");
	By ourPlans = By.xpath("//a[@id='menuOurPlan']");
	By acceptCookies = By.xpath("//a[@id='btnAccept']");

	public void getLogoPresence() 
	{
	
		Assert.assertTrue(driver.findElement(logo).isDisplayed(), "The geoworkz logo is not displayed");
	log.info("Geoworkz logo is displayed");
		
	}
	
	public void getHomeLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Home).isDisplayed(), "The Home link is not displayed");
		log.info("Home link is displayed");
	}
	
	public void getSupportLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Support).isDisplayed(), "Support link is not displayed");
		log.info("Support link is displayed");
	}
	public void getProductLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Product).isDisplayed(), "Product link is  not displayed");
		log.info("Product link is displayed");
	}
	public void getContactLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Contact).isDisplayed(), "Contact link is not displayed");
		log.info("Contact link is displayed");
	}
	
	public void clickOurPlansButton() throws InterruptedException 
	{
		Thread.sleep(2000);
		if (driver.findElement(acceptCookies).isDisplayed()) 
		{
			driver.findElement(acceptCookies).click();
		}
		Actions a = new Actions (driver);
		a.moveToElement(driver.findElement(Product)).build().perform();
		Thread.sleep(1000);
		driver.findElement(ourPlans).click();
	}
}


