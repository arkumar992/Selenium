package dropdownandtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement Table1 =  driver.findElementByXPath("//section[@class='innerblock']");
		List<WebElement> TableRow = Table1.findElements(By.tagName("tr"));
		int TableRow1 = TableRow.size();
		System.out.println("No of Rows:" + TableRow1);
		List<WebElement> TableClm = Table1.findElements(By.tagName("td"));
		int TableClm1 = TableClm.size();
		System.out.println("No of Coloum:" + TableClm1);
		WebElement Progrss = Table1.findElement(By.xpath("//tr[@class='even']/td[2]"));
		String String1 = Progrss.getText();
		System.out.println(String1);
		Table1.findElement(By.xpath("//section[@class='innerblock']//tr[4]/td[3]")).click();
		
		
		
		
	  //table//tr/td
	    
	}

}