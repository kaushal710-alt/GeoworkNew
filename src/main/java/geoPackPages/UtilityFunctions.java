package geoPackPages;

public class UtilityFunctions extends BaseTest {

	static CartPage cp;

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

	public static void checkoutProcessWithoutExtSupport() throws InterruptedException {
		freelancerCheckOut();

		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithExtSupport() throws InterruptedException {

		freelancerCheckOut();
		cp.supportDropDown();
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithoutExtSupportAgency() throws InterruptedException {
		
		agencyCheckout();
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithoutExtSupportAgency(int i) throws InterruptedException {
		agencyCheckout();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithExtSupportAgency() throws InterruptedException {

		agencyCheckout();
		cp.supportDropDown();
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithExtSupportAgency(int i) throws InterruptedException {

		agencyCheckout();
		cp.supportDropDown();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithoutExtSupportEnterPrize() throws InterruptedException {
		
		EnterPrizeCheckout();
		cp.clickCheckoutButton();
	}
	
public static void checkoutProcessWithoutExtSupportEnterPrize(int i) throws InterruptedException {
		
		EnterPrizeCheckout();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
	}

	public static void checkoutProcessWithExtSupportEnterPrize() throws InterruptedException {

		EnterPrizeCheckout();
		cp.supportDropDown();
		cp.clickCheckoutButton();
	}
	
	public static void checkoutProcessWithExtSupportEnterPrize(int i) throws InterruptedException {

		EnterPrizeCheckout();
		cp.supportDropDown();
		cp.addAdditionalLicense(i);
		cp.clickCheckoutButton();
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
