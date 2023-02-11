package windowsandFrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div[1]/p/button").click();
		Thread.sleep(3000);
		WebElement Frame1 = driver.findElementById("childIframe");
		driver.switchTo().frame(Frame1);
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.close();
		
		
	}

}
