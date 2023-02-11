package wdMethods;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import excelLearning.ReadExcelCommon;

public class Annotations extends SeMethods {
	
	public String excelName, testCaseName, testDescription, category, author, moduleName;
	
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}

	@BeforeClass
	public void startTest() {
		startTest(testCaseName, testDescription);
		startTestIteration(moduleName, author, category);
	}
	@Parameters({ "url", "UName", "pwd" })
	@BeforeMethod(/* groups = {"smoke","sanity","regression"} */)
		public void login(String url, String UName, String pwd) {
		
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, UName);
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement clickCRM = locateElement("linktext", "CRM/SFA");
		click(clickCRM);
	}

	@AfterMethod(/*groups = { "smoke", "sanity", "regression" }*/)
	public void CloseBrowser() {
		closeBrowser();
	}

	@AfterSuite
	public void endSuite() {
		endResult();
	}
	
	@DataProvider(name = "getData"/*,indices =1*/)
	public Object[][] getData() throws IOException {
		
		ReadExcelCommon excel = new ReadExcelCommon();
		
		return excel.readExcel(excelName);
}
}