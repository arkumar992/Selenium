package testCaseSeMethod;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class EditLead extends Annotations{
	//@Test(dependsOnMethods = {"testCase.CreateLead.createLead"})
	
	@Test(/*groups="sanity"*/)
		public void deleteLeads() throws InterruptedException {
			
			WebElement leads = locateElement("linktext","Leads");
			click(leads);
			WebElement findleads = locateElement("linktext","Find Leads");
			click(findleads);
			WebElement firstName = locateElement("xpath", "(//input[@name = 'firstName'])[3]");
			type(firstName, "Rohithkumar");
			WebElement findleadsbutton = locateElement("xpath","//button[text()='Find Leads']");
			click(findleadsbutton);
			Thread.sleep(5000);
			WebElement getLeadId = locateElement("xpath","(//a[@class='linktext'])[4]");
			click(getLeadId);
			//String LeadID = getText(getLeadId);
			//System.out.println(LeadID);
			Thread.sleep(3000);
			String expectedTitle = "View Lead | opentaps CRM";
			verifyTitle(expectedTitle);
			WebElement edit = locateElement("xpath","//a[text()='Edit']");
			click(edit);
			Thread.sleep(5000);
			WebElement compName = locateElement("id","updateLeadForm_companyName");
			compName.clear();
			WebElement updatecompName = locateElement("id","updateLeadForm_companyName");
			type(updatecompName,"Amazon");
			WebElement update = locateElement("xpath","(//input[@name='submitButton'])[1]");
			click(update);
			WebElement getcompName = locateElement("id","viewLead_companyName_sp");
			String expected = getText(getcompName);
			verifyExactText(getcompName,expected);
			
		}
	}

