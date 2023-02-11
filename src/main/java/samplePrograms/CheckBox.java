package samplePrograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions Chrome = new  ChromeOptions();
		Chrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElementByXPath("(//input[@type='checkbox'])[6]");		
		checkbox.click();
		if (checkbox.isSelected())
		{
			System.out.println("Check box is selected");
		}
		else
		{
			System.out.println("Check box is not selected");
		}
		

	}

}
