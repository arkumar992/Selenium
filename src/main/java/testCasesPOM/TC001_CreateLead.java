package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesPOM.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "CreateLead";
		testCaseName = "createLead";
		testDescription = "Create a new lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Arun"; // edited by arun 
	}
ss
	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String cname, String Fname, String Lname, String PNo,String Value1) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.companyname(cname)
		.firstName(Fname)
		.lastName(Lname)
		.SourceDD(Value1)
		.pNo(PNo)
		.createSubmit()
		.verfiyCreateLead(Fname);
	}

}
