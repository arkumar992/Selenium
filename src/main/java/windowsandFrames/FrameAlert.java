package windowsandFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		WebElement FrameEle = driver.findElementById("iframeResult");
		driver.switchTo().frame(FrameEle);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Thread.sleep(3000);
		Alert myAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alertText = myAlert.getText();
		System.out.println(alertText);
		myAlert.sendKeys("Rohithkumar");
		Thread.sleep(3000);
		myAlert.accept();
		Thread.sleep(3000);
		WebElement Text = driver.findElementByXPath("//p[@id='demo']");
		String Value = Text.getText();
		System.out.println(Value);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElementById("tryhome").click();
		/*Set<String> String1 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(String1);
		list.addAll(list);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
	}

}
