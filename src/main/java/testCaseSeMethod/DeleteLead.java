package testCaseSeMethod;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class DeleteLead extends Annotations   {
	
	
	@Test(groups="sanity")
	public void delete() throws InterruptedException
	{
		
		WebElement leadsTab = locateElement("linktext","Leads");
		click(leadsTab);
		WebElement findLead = locateElement("linktext","Find Leads");
		click(findLead);
		Thread.sleep(3000);
		WebElement firsrName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firsrName,"Rohithkumar");
		WebElement findLeadButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton);
		Thread.sleep(3000);
		WebElement firstValue = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(firstValue);
		WebElement deleteButton = locateElement("xpath","//a[text()='Delete']");
		click(deleteButton);
			
		
	}

	
}
