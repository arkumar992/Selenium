package projectSession;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class CreateWithSeMethod extends Login {
	
	@Test
	public void createLead() throws InterruptedException{
		login();
		WebElement createContact = locateElement("xpath","//a[text()='Contacts']");
		click(createContact);
		WebElement createContact1 = locateElement("xpath","//a[text()='Create Contact']");
		click(createContact1);
		WebElement firstName = locateElement("id","firstNameField");
		type(firstName, "Rohithkumar");
		WebElement lastName = locateElement("id","lastNameField");
		type(lastName, "Muthusamy");
		WebElement firstNameLocal = locateElement("id","createContactForm_firstNameLocal");
		type(firstNameLocal, "Rohithkumar");
		WebElement lastNameLocal = locateElement("id","createContactForm_lastNameLocal");
		type(lastNameLocal, "Muthusamy");
		WebElement personalTitle = locateElement("id","createContactForm_personalTitle");
		type(personalTitle, "Testing");
		WebElement generalTitle = locateElement("id","createContactForm_generalProfTitle");
		type(generalTitle, "ISIT");
		WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingValue(currency,"INR");
		WebElement discrp = locateElement("id","createContactForm_description");
		type(discrp, "ISIT");
		WebElement note = locateElement("id","createContactForm_importantNote");
		type(note, "ISIT");
		WebElement area = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(area, "91");
		WebElement exe = locateElement("id","createContactForm_primaryPhoneExtension");
		type(exe, "143");
		WebElement mail = locateElement("id","createContactForm_primaryEmail");
		type(mail, "errohith@gmail.com");
		WebElement phone = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phone, "9629616766");
		WebElement askPerson = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(askPerson, "Navas");
		WebElement toName = locateElement("id","generalToNameField");
		String Value1 = getAttribute(toName, "value");
		WebElement address = locateElement("id","createContactForm_generalAddress1");
		type(address, "Chennai");
		WebElement city = locateElement("id","createContactForm_generalCity");
		type(city, "Chennai");
		WebElement postalCode = locateElement("id","createContactForm_generalPostalCode");
		type(postalCode, "600063");
		WebElement posEx = locateElement("id","createContactForm_generalPostalCodeExt");
		type(posEx, "63");
		WebElement attend = locateElement("id","createContactForm_generalAttnName");
		type(attend, "Navas");
		WebElement address2 = locateElement("id","createContactForm_generalAddress2");
		type(address2, "Koduvai");
		WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingValue(country,"IND");
		Thread.sleep(2000);
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingValue(state,"IN-TN");
		WebElement createButton = locateElement("name","submitButton");
		click(createButton);
		WebElement verifyFirstName = locateElement("id","viewContact_fullName_sp");
		verifyPartialText(verifyFirstName,Value1);
		WebElement edit = locateElement("linktext","Edit");
		click(edit);
		Thread.sleep(2000);
		WebElement markting = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingValue(markting,"CATRQ_CARNDRIVER");
		String markting2 = getFirstSelectedOption(markting);
		WebElement add = locateElement("xpath","(//input[@name='submitButton'])[2]");
		click(add);
		Thread.sleep(2000);
		WebElement update = locateElement("name","submitButton");
		click(update);
		WebElement marketingCampaigns = locateElement("id","viewContact_marketingCampaigns_sp");
		verifyPartialText(marketingCampaigns,markting2);
	}
	
	

}
