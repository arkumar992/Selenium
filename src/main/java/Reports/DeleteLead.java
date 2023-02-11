package Reports;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import wdMethods.Annotations;


public class DeleteLead extends Annotations   {
	@BeforeTest
	public void setValues() {
		excelName = "DeleteLead";
		testCaseName = "Delete";
		testDescription = "Delete the lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	
//	@Test(groups="sanity")
	public void delete(String Fname) throws InterruptedException
	{
		
		WebElement leadsTab = locateElement("linktext","Leads");
		click(leadsTab);
		WebElement findLead = locateElement("linktext","Find Leads");
		click(findLead);
		Thread.sleep(3000);
		WebElement firsrName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firsrName,Fname);
		WebElement findLeadButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton);
		Thread.sleep(3000);
		WebElement firstValue = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(firstValue);
		WebElement deleteButton = locateElement("xpath","//a[text()='Delete']");
		click(deleteButton);
			
		
	}

	
}
