package draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement Iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(Iframe);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		//int x=item4.getLocation().getX();
		int y = item4.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, 0, y).perform();
		driver.close();

	}

}
