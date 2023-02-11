package projectSession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("//a[text()='Contacts']").click();
		driver.findElementByXPath("//a[text()='Create Contact']").click();
		driver.findElementById("firstNameField").sendKeys("Rohithkumar");
		driver.findElementById("lastNameField").sendKeys("Muthusamy");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Rohith");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Kumar");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Testing");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("ContactTitle");
		driver.findElementById("createContactForm_departmentName").sendKeys("ISIT");
		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select Drop = new Select(currency);
		Drop.selectByValue("INR");
		driver.findElementById("createContactForm_description").sendKeys("Create Contact");
		driver.findElementById("createContactForm_importantNote").sendKeys("Create Contact");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("143");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("errohith@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9629616766");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Navas");
		String ToName = driver.findElementById("generalToNameField").getAttribute("value");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600063");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("63");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Rohith");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Koduvai");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select Drop1 = new Select(country);
		Drop1.selectByValue("IND");
		Thread.sleep(3000);
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select Drop2 = new Select(state);
		Drop2.selectByValue("IN-TN");
		driver.findElementByName("submitButton").click();
		WebElement Firstname = driver.findElementById("viewContact_fullName_sp");
		String Name = Firstname.getText();
		
		if (Name.contains(ToName))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(3000);
		WebElement marketing  = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select Drop3 = new Select(marketing);
		Drop3.selectByValue("CATRQ_CARNDRIVER");
		String marktingCamp = Drop3.getFirstSelectedOption().getText();
		driver.findElementByXPath("(//input[@name='submitButton'])[2]").click();
		Thread.sleep(3000);		
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		
		WebElement markting2 = driver.findElementById("viewContact_marketingCampaigns_sp");
		String markting1 = markting2.getText();
		
		
		if (markting1.contains(marktingCamp))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}

	}

}
