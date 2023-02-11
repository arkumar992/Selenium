package projectSession;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods {
	public void login() {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			WebElement clickCRM = locateElement("linktext","CRM/SFA");
			click(clickCRM);
		}
}

