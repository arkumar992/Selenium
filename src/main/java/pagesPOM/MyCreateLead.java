package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyCreateLead extends Annotations {
	
	public MyCreateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="createLeadForm_companyName")
	WebElement  companyName;
	@FindBy(id ="createLeadForm_firstName")
	WebElement  firstName;
	@FindBy(id ="createLeadForm_lastName")
	WebElement  lastName;
	@FindBy(id ="createLeadForm_primaryPhoneNumber")
	WebElement  pNo;
	@FindBy(how=How.CLASS_NAME, using ="smallSubmit")
	WebElement  clickSubmit;
	@FindBy(className ="errorMessage")
	WebElement  ErrorMsg;
	@FindBy(id = "createLeadForm_dataSourceId")
	WebElement SourceDD;
	
	
//	public MyVerifyLead CreateLead(String cName,String fName,String lname,String ph) {
		
	
		public MyCreateLead companyname(String cName) {
			type(companyName, cName);
			return this;
			
		}
		
		public MyCreateLead firstName(String fName) {
			type(firstName, fName);
			return this;
			
		}
		
		public MyCreateLead lastName(String lName) {
			type(lastName, lName);
			return this;
			
		}
		
		public MyCreateLead pNo(String pno) {
			type(pNo, pno);
			return this;
			
		}
	
		public MyCreateLead errorMsg(String Expect ) {
			
			verifyPartialText(ErrorMsg, Expect);
			return this;
		}
		
		public MyVerifyLead createSubmit() {
			click(clickSubmit);
			return new MyVerifyLead();
		}
			
		public MyCreateLead createSubmitNeg() {
				click(clickSubmit);
				return this;
			
		}
		public MyCreateLead SourceDD(String Value1) {
			selectDropDownUsingValue(SourceDD, Value1);
			return this;
		}
	
	}
	
