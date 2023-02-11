package windowsandFrames; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		//int count = 0;
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
		System.out.println(iframes.size());
		//for (WebElement frame : iframes)
		{
			List<WebElement> iframes1 = driver.findElements(By.xpath("//iframe"));
			System.out.println(iframes1.size());
			//count = count + iframes1;
		}
				
	}

}
