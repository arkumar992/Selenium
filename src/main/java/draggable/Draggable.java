package draggable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement Iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(Iframe);
		WebElement Draggable = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(Draggable, 100, 100).perform();
	    Thread.sleep(3000);
		driver.close();		
	}
}
