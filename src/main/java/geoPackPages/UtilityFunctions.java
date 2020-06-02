package geoPackPages;

import java.io.IOException;

public class UtilityFunctions extends BaseTest {

	static CartPage cp;
	static CheckOutFormPage cofp;
	
	public static void userDetailsFormPage () throws IOException, InterruptedException 
	{
		cofp = new CheckOutFormPage();
		cofp.fillTheFormPage();
		cofp.checkSubscriptionCheckbox();
		
		Thread.sleep(2000);
		cofp.checkSubscriptionCheckbox1();
		cofp.clickSubmitButton();
		
	}

	public static void freelancerCheckOut() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickOnBuyNowButtonFreelancer(planType);
		cp = new CartPage();
	}
	
	public static void agencyCheckout () throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonAgency(planType);
		cp = new CartPage();
	}
	
	public static void EnterPrizeCheckout() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonEnterPrize(planType);
		cp = new CartPage();	
	}

	public static void checkoutProcessWithoutExtSupport() throws InterruptedException, IOException {
		
		freelancerCheckOut();
		cp.clickCheckoutButton();
		userDetailsFormPage();
		
	}

	public static void checkoutProcessWithExtSupport() throws InterruptedException, IOException {

		freelancerCheckOut();
		cp.supportDropDown();
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithoutExtSupportAgency() throws InterruptedException, IOException {
		
		agencyCheckout();
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithoutExtSupportAgency(int i) throws InterruptedException, IOException {
		agencyCheckout();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithExtSupportAgency() throws InterruptedException, IOException {

		agencyCheckout();
		cp.supportDropDown();
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithExtSupportAgency(int i) throws InterruptedException, IOException {

		agencyCheckout();
		cp.supportDropDown();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithoutExtSupportEnterPrize() throws InterruptedException, IOException {
		
		EnterPrizeCheckout();
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}
	
public static void checkoutProcessWithoutExtSupportEnterPrize(int i) throws InterruptedException, IOException {
		
		EnterPrizeCheckout();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

	public static void checkoutProcessWithExtSupportEnterPrize() throws InterruptedException, IOException {

		EnterPrizeCheckout();
		cp.supportDropDown();
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}
	
	public static void checkoutProcessWithExtSupportEnterPrize(int i) throws InterruptedException, IOException {

		EnterPrizeCheckout();
		cp.supportDropDown();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
		userDetailsFormPage();
	}

//	public static String getTestDataFromXMLFile(String strXpath) {
//		String valTobereturned = null;
//		try {
//
//			strXpath = "Automation/" + getpropertyFromPropertyfile("AppEnv") + "/" + strXpath;
//			File xmlfile = new File("TestData.xml");
//
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//
//			Document doc = dBuilder.parse(xmlfile);
//
//			doc.getDocumentElement().normalize();
//
//			XPath xPath = XPathFactory.newInstance().newXPath();
//
//			NodeList nodelst = (NodeList) xPath.compile(strXpath).evaluate(doc, XPathConstants.NODESET);
//
//			valTobereturned = nodelst.item(0).getTextContent();
//		} catch (Exception e) {
//
//			Assert.fail("exception occured while reading data from xml file: " + e.toString());
//		}
//
//		return valTobereturned;
//	}
}
