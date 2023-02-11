package windowsandFrames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Multi-PopUp Test #2']").click();
		Set<String> String1 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(String1);
		list.addAll(list);
		driver.switchTo().window(list.get(1));
		driver.close();
		driver.switchTo().window(list.get(2));
		driver.close();
		driver.switchTo().window(list.get(3));
		driver.close();
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
