package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	ChromeDriver driver;
	@Given("Launch the Browser")
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@And("Maximizi the Browser")
	public void Maxmixze() {
		driver.manage().window().maximize();
	}
	
	@And("Load the URL")
	public void URL() {
		driver.get("http://leaftaps.com/opentaps/");
	}


	@And("Set the TimeOut")
	public void TimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Enter the userName as (.*)")
	public void EnterUserName(String Uname) {
		driver.findElementById("username").sendKeys(Uname);
	}
	
	@And("Enter the Password as (.*)")
	public void EnterPassword(String Pwd) {
		driver.findElementById("password").sendKeys(Pwd);
	}
	
	@And("Click on Login Button")
	public void ClickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Verify the Login Successfully")
	public void VerifyLogin() {
		System.out.println("Login Successfully");
	}
	
	@And("Click CRF/SFA")
	public void ClickCRF() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on CreateLead")
	public void ClickCreateLeadlink() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter Company Name as (.*)")
	public void EnterCName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}
	@And("Enter FirstName as (.*)")
	public void EnterFname(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}
	@And("Enter LastName as (.*)")
	public void EnterLname(String lname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	@When("Click on Create Lead")
	public void ClickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Verify the First Name")
	public void VerifyFirstName() {
		WebElement Firstname = driver.findElementById("viewLead_firstName_sp");
		String Name = Firstname.getText();
		String Expected = "Rohith1";

		if (Name.equalsIgnoreCase(Expected))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}
	}
	@But("Verify Error Message")
	public void erroeMessage(){
		WebElement ErrorMessage = driver.findElementByClassName("errorMessage");
		String Errormessage = ErrorMessage.getText();
		System.out.println(Errormessage);
		String ActualMsg ="The following required parameter is missing: [crmsfa.createLead.companyName]";
		if (Errormessage.contains(ActualMsg))
		{
			System.out.println("Verfied");
		}
		else
		{
			System.out.println("Not Verifed");
		}
	}
		
	@And("Close the Browser")
	public void close() {
		driver.close();
	}
	
}
