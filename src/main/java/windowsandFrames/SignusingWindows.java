package windowsandFrames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignusingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set<String> Contact = driver.getWindowHandles();
		List<String> list = new ArrayList<>(Contact);
		list.addAll(list);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("//a[text()='Compatible Browser']").click();
		Set<String> Contact1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(Contact1);
		list.addAll(list1);
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(1));
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.close();
		driver.switchTo().window(list1.get(2));
		WebElement Browser = driver.findElementByXPath("//div[@class='content_12']");
		String BrowserList = Browser.getText();
		System.out.println(BrowserList);
		
	}

}
