package draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		WebElement Iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(Iframe);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).release(item4).perform();
		driver.close();

	}

}
