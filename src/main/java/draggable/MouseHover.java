package draggable;
import wdMethods.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MouseHover extends SeMethods{

	//public static void main(String[] args) {
	@Test
	public void MouseHover1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement TV = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement Thomson = driver.findElementByXPath("//span[text()='Thomson']");
		MouseOver(TV);
		click(Thomson);
		//Actions builder = new Actions(driver);
		//builder.moveToElement(TV).pause(3000).click(Thomson).perform();
		//driver.close();

	}
}

