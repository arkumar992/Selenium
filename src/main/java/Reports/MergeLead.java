package Reports;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import wdMethods.Annotations;

public class MergeLead extends Annotations {
	@BeforeTest
	public void setValues() {
		excelName = "MergeLead";
		testCaseName = "Merge";
		testDescription = "Merge the lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	
	//@Test(/*groups = "regression"*/)
	public void LeadMerge(String Fname, String Fname1){
		
		WebElement linkLead = locateElement("linktext","Leads");
		click(linkLead);
		WebElement linkMerge = locateElement("linktext","Merge Leads");
		click(linkMerge);
		WebElement fromLead = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(fromLead);
		switchToWindow(1);
		//Max();
		WebElement firstName = locateElement("xpath", "(//input[@name = 'firstName'])[1]");
		type(firstName, Fname);
		WebElement findButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findButton);
		Thread();
		WebElement firstResult = locateElement("xpath","(//a[@class='linktext'])[1]");
		String Value = firstResult.getText();
		System.out.println(Value);
		click(firstResult);
		Thread();
		switchToWindow(0);
		WebElement toLead = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(toLead);
		switchToWindow(1);
		WebElement firstName1 = locateElement("xpath", "(//input[@name = 'firstName'])[1]");
		type(firstName1, Fname1);
		WebElement findButton1 = locateElement("xpath","//button[text()='Find Leads']");
		click(findButton1);
		Thread();
		WebElement firstResult1 = locateElement("xpath","(//a[@class='linktext'])[1]");
		click(firstResult1);
		//closeBrowser();
		switchToWindow(0);
		WebElement mergeButton = locateElement("xpath","//a[text()='Merge']");
		click(mergeButton);
		acceptAlert();
		Thread();
		WebElement findLeadButton = locateElement("xpath","//a[text()='Find Leads']");
		click(findLeadButton);
		
		WebElement leads1 = locateElement("name","id");
		type(leads1,Value);
	
		WebElement findLeadButton1 = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton1);
		
		WebElement errorMessage = locateElement("xpath","//div[@class='x-paging-info']");
		verifyExactText(errorMessage,"No records to display");
	
		
	}
}
