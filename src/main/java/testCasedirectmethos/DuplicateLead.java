package testCasedirectmethos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	DuplicateLead() throws Exception {
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
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Leads").click();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Find Leads").click();
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		Thread.sleep(3000);
		driver.findElementByName("emailAddress").sendKeys("ambi@infoys.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		WebElement Firstname = driver.findElementByXPath("(//a[@class='linktext'])[6]");
		String FName = Firstname.getText();
		System.out.println(FName);
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String ExpectdTitle = "Duplicate Lead | opentaps CRM";
		if(actualTitle.equalsIgnoreCase(ExpectdTitle))
		{
			System.out.println("Title Verfied");
		}
		else
		{
			System.out.println("Not Matched");
		}
		driver.findElementByClassName("smallSubmit").click();
		WebElement Firstname1 = driver.findElementById("viewLead_firstName_sp");
		String Name = Firstname1.getText();
		String Expected = FName;
		
		if (Name.equalsIgnoreCase(Expected))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}

		driver.close();
	}

}


