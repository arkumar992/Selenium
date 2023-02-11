package testCasedirectmethos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DeleteLead() throws Exception {
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
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Find Leads").click();
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		Thread.sleep(3000);
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneNumber").sendKeys("8963255842");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		WebElement CompanyName = driver.findElementByXPath("(//a[@class='linktext'])[4]");
		String CName = CompanyName.getText();
		System.out.println(CName);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByName("id").sendKeys(CName);
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(3000);
		WebElement ErrorMessage = driver.findElementByXPath("//div[@class='x-paging-info']");
		String ErrorMessage1 =  ErrorMessage.getText();
		String Expected = "No records to display";
		if(ErrorMessage1.equalsIgnoreCase(Expected))
		{
			System.out.println("Record Not Found");
		}
		else
		{
			System.out.println("Record Found");
		}
		
		driver.close();
		}

}
