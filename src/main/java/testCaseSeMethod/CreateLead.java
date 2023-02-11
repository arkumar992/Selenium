package testCaseSeMethod;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.Annotations;

public class CreateLead extends Annotations{
	
	@Test(dataProvider = "getData")
	/*groups="smoke"*/
	public void createLead(String cname,String Fname,String Lname,int PNo,String Source ){
		
		WebElement clickCreatLead = locateElement("linktext","Create Lead");
		click(clickCreatLead);
		
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName,cname);
		
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,Fname);
		
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,Lname);
		
		WebElement Pno = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(Pno,""+PNo);
		
		WebElement sourceDD = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingValue(sourceDD,Source);
		
		WebElement createButton = locateElement("class","smallSubmit");
		click(createButton);
		
		WebElement FirstName = locateElement("id","viewLead_firstName_sp");
		verifyExactText(FirstName,"Rohithkumar");
		
		verifyExactAttribute(FirstName,"id","viewLead");
		
		verifyTitle("View Lead | opentaps CRM");
		
			
	}
	@DataProvider(name = "getData",indices =1)
	public Object[][] getData() {
		Object[][] data = new Object[2][5]; {
			data[0][0] = "Renault Nissan";
			data[0][1] = "Rohithkumar";
			data[0][2] = "Muthusamy";
			data[0][3] = 96296166;
			data[0][4] = "LEAD_CONFERENCE";
			
			data[1][0] = "CPT";
			data[1][1] = "Rohithkumar";
			data[1][2] = "Muthusamy";
			data[1][3] = 96296166;
			data[1][4] = "LEAD_CONFERENCE";
		}
		
		return data;
		
	}
	

}
