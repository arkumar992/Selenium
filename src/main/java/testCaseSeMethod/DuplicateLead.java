package testCaseSeMethod;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class DuplicateLead extends Annotations {
	
	@Test(groups = "regression")
	
	
	public void Duplicate() throws InterruptedException{
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement clickCRM = locateElement("linktext","CRM/SFA");
		click(clickCRM);*/
		WebElement leads = locateElement("linktext","Leads");
		click(leads);
		WebElement findleads = locateElement("linktext","Find Leads");
		click(findleads);
		WebElement firstName = locateElement("xpath", "(//input[@name = 'firstName'])[3]");
		type(firstName, "Rohithkumar");
		WebElement findleadsbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(findleadsbutton);
		Thread.sleep(5000);
		WebElement fName = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(fName);
		WebElement duplicateLead = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(duplicateLead);
		Thread.sleep(5000);
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		verifyTitle(expectedTitle);
		WebElement createLead = locateElement("class","smallSubmit");
		click(createLead);	
		closeBrowser();
	}
}
