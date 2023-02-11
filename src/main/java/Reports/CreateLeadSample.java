package Reports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import wdMethods.SeMethods;

public class CreateLeadSample  extends SeMethods{
int i =1;

	@Test
	public void createLead() throws IOException{		
			
			//@BeforeSuite
			ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
			html.setAppendExisting(false);		
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(html);
			//@BeforeTest -> setData 
			String testCasesName = "TC001";
			String testCasesDesc = "Create a new Lead in Leaftaps";
			
			//@BeforeClass
			ExtentTest suiteTest = extent.createTest(testCasesName, testCasesDesc);
			//@BeforeMethod
			ExtentTest test = suiteTest.createNode("Leads");//for each Row in DP
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			System.out.println("The browser:	 chrome launched successfully");
			test.pass("The browser: chrome launched successfully",
					MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+System.currentTimeMillis() +".png").build());
			
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			
			test.pass("UserName Entered Successfully",
					MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+System.currentTimeMillis() +".png").build());
			//System.out.println("The username entered successfully with data - DemoSalesManager");
			
			test.pass("The username entered successfully with data - DemoSalesManager");
					
			
			driver.findElementById("password").sendKeys("crmsfa");
			//System.out.println("The password entered successfully with data - crmsfa");
			
			
			driver.findElementByClassName("decorativeSubmit").click();
			System.out.println("The Login button clicked");
			
			driver.findElementByLinkText("CRM/SFA").click();
			System.out.println("The CRM/SFA link clicked");
			
			driver.findElementByLinkText("Create Lead").click();		
			System.out.println("The Create Lead link clicked");
			
			File src = driver.getScreenshotAs(OutputType.FILE);
			File desc = new File("./snaps/"+System.currentTimeMillis() + ".png");
			FileUtils.copyFile(src, desc);
		
			extent.flush();
			
		}
	
		
	
	}

