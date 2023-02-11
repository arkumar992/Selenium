package Reports;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;

import wdMethods.Annotations;

public class CreateLead extends Annotations {

	@BeforeTest
	public void setValues() {
		excelName = "CreateLead";
		testCaseName = "createLead";
		testDescription = "Create a new lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String cname, String Fname, String Lname, String PNo, String Source) {

		WebElement clickCreatLead = locateElement("linktext", "Create Lead");
		click(clickCreatLead);

		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, cname);

		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, Fname);

		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, Lname);

		WebElement Pno = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(Pno, PNo);

		WebElement sourceDD = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingValue(sourceDD, Source);

		WebElement createButton = locateElement("class", "smallSubmit");
		click(createButton);

		WebElement FirstName = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(FirstName, "Rohithkumar");

		verifyExactAttribute(FirstName, "id", "viewLead");

		verifyTitle("View Lead | opentaps CRM");

	}

}
