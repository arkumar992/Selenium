package Reports;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import wdMethods.Annotations;

public class EditLead extends Annotations{
	//@Test(dependsOnMethods = {"testCase.CreateLead.createLead"})

	@BeforeTest
	public void setValues() {
		excelName = "EditLead";
		testCaseName = "Edit";
		testDescription = "Edit the lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	public void editLeads(String CName) throws InterruptedException {

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
		type(updatecompName,CName);
		WebElement update = locateElement("xpath","(//input[@name='submitButton'])[1]");
		click(update);
		WebElement getcompName = locateElement("id","viewLead_companyName_sp");
		String expected = getText(getcompName);
		verifyExactText(getcompName,expected);

	}
}

