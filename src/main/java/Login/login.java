package Login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(Chrome);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement UserName = driver.findElementById("username");
		UserName.sendKeys("DemoSalesManager");
		WebElement Password=driver.findElementById("password");
		Password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CPT");
		driver.findElementById("createLeadForm_firstName").sendKeys("Natarajan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Mohan");
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select Drop = new Select(Industry);
		Drop.selectByValue("IND_INSURANCE");
		List<WebElement> allOptions = Drop.getOptions();
		int size = allOptions.size();

		for (WebElement opt:allOptions)
		{
			System.out.println(opt.getText());
		}
		Drop.selectByIndex(size-1);
		//System.out.println(allOptions.get(size));
		driver.findElementByClassName("smallSubmit").click();
	}

}
