package testCasedirectmethos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		//ExtentHtmlReport html = new ExtentHtmlReport("./reports/result.html");
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement UserName = driver.findElementById("username");
		UserName.sendKeys("DemoSalesManager");
		WebElement Password=driver.findElementById("password");
		Password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Renault Nissan");
		driver.findElementById("createLeadForm_firstName").sendKeys("Rohithkumar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Muthusamy");
		//driver.findElementByXPath("//img[@alt='Lookup']/@src").click();
		//Thread.sleep(6000);
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select Drop1 = new Select(Source);
		Drop1.selectByValue("LEAD_CONFERENCE");
		WebElement Source1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select Drop2 = new Select(Source1);
		Drop2.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Kavya");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kavya2");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Simulation");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2000");
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select Drop = new Select(Industry);
		Drop.selectByValue("IND_INSURANCE");
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select owner1 = new Select(owner);
		owner1.selectByValue("OWN_PARTNERSHIP");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Creation is done");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("143");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		WebElement Currency = driver.findElementById("createLeadForm_currencyUomId");
		Select Currency1 = new Select(Currency);
		Currency1.selectByValue("INR");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Test");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("kavya");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.rohith.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Kavyakumar");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Tiruppur");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Koduvai");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Tirupur");
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select Country1 = new Select(Country);
		Country1.selectByValue("IND");
		Thread.sleep(5000);
		WebElement State = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select State1 = new Select(State);
		State1.selectByValue("IN-TN");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600063");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("91");
		WebElement Campaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select Campaign1 = new Select(Campaign);
		Campaign1.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9629616766");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("errohith@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		WebElement Firstname = driver.findElementById("viewLead_firstName_sp");
		String Name = Firstname.getText();
		String Expected = "Rohith";

		if (Name.equalsIgnoreCase(Expected))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}

	}


}



