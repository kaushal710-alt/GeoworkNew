package geoPackPages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

//import GeoPack.HomePageTest;

public class OurPlansPage_Original extends BaseTest{
	
	private static Logger log = LogManager.getLogger(OurPlansPage_Original.class.getName());
	
	By signUp = By.id("lnkFreelanceFreeTrail");
	By FreelancerButton = By.xpath("//li[@id='lnkEnterprises']/preceding-sibling::li[2]");
	By AgenciesButton = By.xpath("//li[@id='lnkFreelancer']/following-sibling::li[1]");
	By EnterPrizeButton = By.xpath("//li[@id='lnkFreelancer']/following-sibling::li[2]");
	By FreeMonthly5k = By.xpath("//label[@id='lblMonthlyCost1']");
	By FreeAnnually5k = By.xpath("//label[@id='lblAnnuallyCost1']");
	By FreeMonthly30k = By.xpath("//label[@id='lblMonthlyCost2']");
	By FreeAnnually30k = By.xpath("//label[@id='lblAnnuallyCost2']");
	By FreeMonthly50k = By.xpath("//label[@id='lblMonthlyCost3']");
	By FreeAnnually50k = By.xpath("//label[@id='lblAnnuallyCost3']");
	By FreeMonthly80k = By.xpath("//label[@id='lblMonthlyCost4']");
	By FreeAnnually80k = By.xpath("//label[@id='lblAnnuallyCost4']");
	By FreeBuyNowButton5k = By.xpath("//button[@id='btn1']");
	By FreeBuyNowButton30k = By.xpath("//button[@id='btn2']");
	By FreeBuyNowButton50k = By.xpath("//button[@id='btn3']");
	By FreeBuyNowButton80k = By.xpath("//button[@id='btn4']");
	
	By AgenMonthly10k = By.xpath("//label[@id='lblMonthlyCost5']");
	By AgenAnnually10k = By.xpath("//label[@id='lblAnnualCost5']");
	By AgenMonthly20k = By.xpath("//label[@id='lblMonthlyCost6']");
	By AgenAnnually20k = By.xpath("//label[@id='lblAnnualCost6']");
	By AgenMonthly80k = By.xpath("//label[@id='lblMonthlyCost7']");
	By AgenAnnually80k = By.xpath("//label[@id='lblAnnualCost7']");
	By AgenMonthly160k = By.xpath("//label[@id='lblMonthlyCost8']");
	By AgenAnnually160k = By.xpath("//label[@id='lblAnnualCost8']");
	By AgenMonthly240k = By.xpath("//label[@id='lblMonthlyCost9']");
	By AgenAnnually240k = By.xpath("//label[@id='lblAnnualCost9']");
	By AgenMonthly350k = By.xpath("//label[@id='lblMonthlyCost10']");
	By AgenAnnually350k = By.xpath("//label[@id='lblAnnualCost10']");
	By AgenMonthly500k = By.xpath("//label[@id='lblMonthlyCost11']");
	By AgenAnnually500k = By.xpath("//label[@id='lblAnnualCost11']");
	By AgenMonthly750k = By.xpath("//label[@id='lblMonthlyCost12']");
	By AgenAnnually750k = By.xpath("//label[@id='lblAnnualCost12']");
	By AgenMonthly1000k = By.xpath("//label[@id='lblMonthlyCost13']");
	By AgenAnnually1000k = By.xpath("//label[@id='lblAnnualCost13']");
	By AgenBuyNowButton10k = By.xpath("//button[@id='btn5']");
	By AgenBuyNowButton20k = By.xpath("//button[@id='btn6']");
	By AgenBuyNowButton80k = By.xpath("//button[@id='btn7']");
	By AgenBuyNowButton160k = By.xpath("//button[@id='btn8']");
	By AgenBuyNowButton240k = By.xpath("//button[@id='btn9']");
	By AgenBuyNowButton350k = By.xpath("//button[@id='btn10']");
	By AgenBuyNowButton500k = By.xpath("//button[@id='btn11']");
	By AgenBuyNowButton750k = By.xpath("//button[@id='btn12']");
	By AgenBuyNowButton1000k = By.xpath("//button[@id='btn13']");
	
	By EntMonthly10k = By.xpath("//label[@id='lblMonthlyNa14']");
	By EntAnnually10k = By.xpath("//label[@id='lblAnnuallyCost14']");
	By EntMonthly250k = By.xpath("//label[@id='lblMonthlyCost15']");
	By EntAnnually250k = By.xpath("//label[@id='lblAnnuallyCost15']");
	By EntMonthly500k = By.xpath("//label[@id='lblMonthlyCost16']");
	By EntAnnually500k = By.xpath("//label[@id='lblAnnuallyCost16']");
	By EntMonthly1000k = By.xpath("//label[@id='lblMonthlyCost17']");
	By EntAnnually1000k = By.xpath("//label[@id='lblAnnuallyCost17']");
	By EntBuyNowButton10k = By.xpath("//button[@id='btn14']");
	By EntBuyNowButton250k = By.xpath("//button[@id='btn15']");
	By EntBuyNowButton500k = By.xpath("//button[@id='btn16']");
	By EntBuyNowButton1000k = By.xpath("//button[@id='btn17']");

	public void clickSignUpButton() 
	{
		driver.findElement(signUp).click();
	}
	public void clickPlanTypeButton(String planType) throws InterruptedException 
	{
		if (planType.contains("Freelancer")) 
		{
			driver.findElement(FreelancerButton).click();
		}
		else if(planType.contains("Agency")) 
		{
			Thread.sleep(2000);
			driver.findElement(AgenciesButton).click();
		}
		else 
		{
			Thread.sleep(2000);
			driver.findElement(EnterPrizeButton).click();
		}
	}
	
	/*
	 * public void selectPlanRadioButton( String planType) { if
	 * (planType.contains("FreelancerMonthly5000")) {
	 * driver.findElement(By.xpath("//label[@id='lblMonthlyCost1']")).click(); }
	 * 
	 * }
	 */
	
	public String getPlanType() 
	{
		ITestResult method = Reporter.getCurrentTestResult();
		String planType1 = method.getMethod().getMethodName();
		return planType1;	
	}
	
	
	public void clickOnBuyNowButtonFreelancer(String planType) throws InterruptedException 
	{		
		Thread.sleep(2000);
			if (planType.contains("Monthly5000"))
			{	
				driver.findElement(FreeMonthly5k).click();
				driver.findElement(FreeBuyNowButton5k).click();
			}	
			
			else if (planType.contains("Annually5000"))
			{	
				driver.findElement(FreeAnnually5k).click();
				driver.findElement(FreeBuyNowButton5k).click();
			}
			
			else if (planType.contains("Monthly30000"))  
			{	
				driver.findElement(FreeMonthly30k).click();
				driver.findElement(FreeBuyNowButton30k).click();
			}
			
			else if (planType.contains("Annually30000")) 
			{	
				driver.findElement(FreeAnnually30k).click();
				driver.findElement(FreeBuyNowButton30k).click();
			}
			
			else if (planType.contains("Monthly50000")) 
			{	
				driver.findElement(FreeMonthly50k).click();
				driver.findElement(FreeBuyNowButton50k).click();
			}
			else if (planType.contains("Annually50000"))
			{	
				driver.findElement(FreeAnnually50k).click();
				driver.findElement(FreeBuyNowButton50k).click();
			}
			else if (planType.contains("Monthly80000")) 
			{	
				driver.findElement(FreeMonthly80k).click();
				driver.findElement(FreeBuyNowButton80k).click();
			}
			else if (planType.contains("Annually80000")) 
			{	
				driver.findElement(FreeAnnually80k).click();
				driver.findElement(FreeBuyNowButton80k).click();
			}
		}
		
	
	
	public void clickOnBuyNowButtonAgency(String planType) throws InterruptedException 
	{
		
			if (planType.contains("Monthly10000Smallest"))
			{	
				driver.findElement(AgenMonthly10k).click();
				driver.findElement(AgenBuyNowButton10k).click();
			}
			
			else if (planType.contains("Annually10000Smallest")) 
			{	
				driver.findElement(AgenAnnually10k).click();
				driver.findElement(AgenBuyNowButton10k).click();
			}
			
			
			else if (planType.contains("Monthly20000"))
			{	
				driver.findElement(AgenMonthly20k).click();
				driver.findElement(AgenBuyNowButton20k).click();
			}
			
			else if (planType.contains("Annually20000"))
			{	
				driver.findElement(AgenAnnually20k).click();
				driver.findElement(AgenBuyNowButton20k).click();
			}
			
			
			else if (planType.contains("Monthly80000")) 
			{	
				driver.findElement(AgenMonthly80k).click();
				driver.findElement(AgenBuyNowButton80k).click();
			}
			
			else if (planType.contains("Annually80000"))
			{	
				driver.findElement(AgenAnnually80k).click();
				driver.findElement(AgenBuyNowButton80k).click();
			}
			
			
			
			else if (planType.contains("Monthly160000"))
			{	
				driver.findElement(AgenMonthly160k).click();
				driver.findElement(AgenBuyNowButton160k).click();
			}
			
			else if (planType.contains("Annually160000"))
			{	
				driver.findElement(AgenAnnually160k).click();
				driver.findElement(AgenBuyNowButton160k).click();
			}
			
			
			
			else if (planType.contains("Monthly240000")) 
			{	
				driver.findElement(AgenMonthly240k).click();
				driver.findElement(AgenBuyNowButton240k).click();
			}
			
			else if (planType.contains("Annually240000")) 
			{	
				driver.findElement(AgenAnnually240k).click();
				driver.findElement(AgenBuyNowButton240k).click();
			}
			
			
			
			else if (planType.contains("Monthly350000"))
			{	
				driver.findElement(AgenMonthly350k).click();
				driver.findElement(AgenBuyNowButton350k).click();
			}
			
			else if (planType.contains("Annually350000"))
			{	
				driver.findElement(AgenAnnually350k).click();
				driver.findElement(AgenBuyNowButton350k).click();
			}
			
			
			
			else if (planType.contains("Monthly500000")) 
			{	
				driver.findElement(AgenMonthly500k).click();
				driver.findElement(AgenBuyNowButton500k).click();
			}
			
			else if (planType.contains("Annually500000")) 
			{	
				driver.findElement(AgenAnnually500k).click();
				driver.findElement(AgenBuyNowButton500k).click();
			}
			
			
			
			else if (planType.contains("Monthly750000")) 
			{	
				driver.findElement(AgenMonthly750k).click();
				driver.findElement(AgenBuyNowButton750k).click();
			}
			
			else if (planType.contains("Annually750000"))
			{	
				driver.findElement(AgenAnnually750k).click();
				driver.findElement(AgenBuyNowButton750k).click();
			}
			
			else if (planType.contains("Monthly1000000")) 
			{	
				driver.findElement(AgenMonthly1000k).click();
				driver.findElement(AgenBuyNowButton1000k).click();
			}
			
			else if (planType.contains("Annually1000000")) 
			{	
				driver.findElement(AgenAnnually1000k).click();
				driver.findElement(AgenBuyNowButton1000k).click();
			}
			
		}
	
	
	public void clickOnBuyNowButtonEnterPrize(String planType) throws InterruptedException 
	{
		//Thread.sleep(3000);
		//List <WebElement> listEnterPrize = driver.findElements(By.xpath("//div[@class='col-xs-12']/div[3]/div[2]/div[@class='row']//div[@class='radio-container']"));
		//String text = driver.findElement(By.xpath("//div[@id='lblEnterpriseWords']")).getText();
			
			if ((planType.contains("NA"))) 
			{	
				log.info("There is no monthly plan available for 10000 words plan");
			}
			
			else if ((planType.contains("Annually10000Smallest"))) 
			{	
				driver.findElement(EntAnnually10k).click();
				driver.findElement(EntBuyNowButton10k).click();
				
			}
			
			else if ((planType.contains("Monthly250000"))) 
			{	
				driver.findElement(EntMonthly250k).click();
				driver.findElement(EntBuyNowButton250k).click();
			}
			
			else if ((planType.contains("Annually250000"))) 
			{	
				driver.findElement(EntAnnually250k).click();
				driver.findElement(EntBuyNowButton250k).click();
			}
			
			else if ((planType.contains("Monthly500000"))) 
			{	
				driver.findElement(EntMonthly500k).click();
				driver.findElement(EntBuyNowButton500k).click();
			}
			
			else if ((planType.contains("Annually500000"))) 
			{	
				driver.findElement(EntAnnually500k).click();
				driver.findElement(EntBuyNowButton500k).click();
			}
			
			else if ((planType.contains("Monthly1000000"))) 
			{	
				driver.findElement(EntMonthly1000k).click();
				driver.findElement(EntBuyNowButton1000k).click();
			}
			
			else if ((planType.contains("Annually1000000"))) 
			{	
				
				driver.findElement(EntAnnually1000k).click();
				driver.findElement(EntBuyNowButton1000k).click();
			}
		
	/*
	 * public void clickOnBuyNowButton(String planType,String words) { List
	 * <WebElement> listplan = driver.findElements(By.xpath(
	 * "//div[@class='radio-container']//label[contains(@for,'Freelancer')]"));
	 * String listwords =
	 * driver.findElement(By.xpath("//div[contains(@id,'FreelancerWords')]")).
	 * getText();;
	 * 
	 * for (int i=0;i<listplan.size();i++) {
	 * 
	 * 
	 * 
	 * String textplan=listplan.get(i).getText();
	 * 
	 * 
	 * 
	 * if (textplan.contains("Annually")&&listwords.equals(words)) {
	 * listplan.get(i).click(); break; //list.get(i).findElement(By.
	 * xpath("//button[@class='btn btn-default freelancer btnBuyplan']")).click(); }
	 * 
	 * }
	 * 
	 * //}
	 * 
	 * 
	 * }
	 */
	
}
	
}
	
	

