package testCasedirectmethos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {


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
		driver.findElementByPartialLinkText("Leads").click();
		driver.findElementByPartialLinkText("My Leads").click();
		driver.findElementByPartialLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Rohithkumar"); 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String ExpectdTitle = "View Lead | opentabs CRM";

		if(actualTitle.equalsIgnoreCase(ExpectdTitle))
		{
			System.out.println("Title Verfied");
		}
		else
		{
			System.out.println("Not Matched");
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(5000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Amazon");
		driver.findElementByName("submitButton").click();
		WebElement CompanyName = driver.findElementById("viewLead_companyName_sp");
		String CName = CompanyName.getText();
		String Expected = CompanyName.getText();
		if (Expected.equals(CName))
		{
			System.out.println("Company Name Verfied");
		}
		else
		{
			System.out.println("Incorrect Company Name");
		}
		driver.close();




	}

}


