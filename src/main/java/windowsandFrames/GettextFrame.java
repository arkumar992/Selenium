package windowsandFrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GettextFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Draggable']").click();
		Thread.sleep(3000);
		WebElement Iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(Iframe);
		WebElement Text = driver.findElementById("draggable");
		String Print = Text.getText();
		System.out.println(Print);
	}
	
}
