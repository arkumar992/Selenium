package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:userName").sendKeys("errohith143");
		driver.findElementById("userRegistrationForm:password").sendKeys("Rohith143");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Rohith143");
		WebElement security = driver.findElementById("userRegistrationForm:securityQ");
		Select security1 = new Select(security);
		security1.selectByValue("1");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("GHHS");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Rohith");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement Date = driver.findElementById("userRegistrationForm:dobDay");
		Select Date1 = new Select(Date);
		Date1.selectByValue("19");
		WebElement Month = driver.findElementById("userRegistrationForm:dobMonth");
		Select Month1 = new Select(Month);
		Month1.selectByValue("10");
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select Year1 = new Select(year);
		Year1.selectByVisibleText("1990");
		WebElement Occupation  = driver.findElementById("userRegistrationForm:occupation");
		Select Occupation1 = new Select(Occupation);
		Occupation1.selectByValue("2");
		WebElement Country = driver.findElementById("userRegistrationForm:countries");
		Select Country1 = new Select(Country);
		Country1.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("errohith@gmail.com");
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9629616766");
		driver.findElementById("userRegistrationForm:address").sendKeys("Chennai");
		driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("600063",Keys.TAB);
		Thread.sleep(5000);
		WebElement CityTown = driver.findElementById("userRegistrationForm:cityName");
		Select CityTown1  = new Select(CityTown);
		CityTown1.selectByVisibleText("Kanchipuram");
		Thread.sleep(5000);
		WebElement PostOffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select PostOffice1 = new Select(PostOffice);
		PostOffice1.selectByValue("Srinivasanagar East B.O");
		List<WebElement> allOptions = PostOffice1.getOptions();
		int size = allOptions.size();

		for (WebElement opt1:allOptions)
		{
			System.out.println(opt1.getText());
		}
		PostOffice1.selectByIndex(size-1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("04212312364");

	}

}
