package draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import wdMethods.SeMethods;

public class Droppable extends SeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement Iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(Iframe);
		WebElement Draggable = driver.findElementById("draggable");
		WebElement Droppable = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(Draggable, Droppable).perform();
		driver.close();		
	}
}
