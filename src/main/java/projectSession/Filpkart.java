package projectSession;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Filpkart extends SeMethods{
	@Test
	public void Filpkart1() throws InterruptedException {
		startApp("firefox", "https://www.flipkart.com/");
		WebElement closeX = locateElement("xpath","//button[text()='✕']");
		click(closeX);
		WebElement TV = locateElement("xpath","//span[text()='TVs & Appliances']");
		MouseOver(TV);
		Thread.sleep(3000);
		WebElement samsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
		click(samsung);
		WebElement minium = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingValue(minium,"25000");
		WebElement maximun = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(maximun,"60000");
		scrolldown();
		WebElement screenSize = locateElement("xpath","//div[text()='Screen Size']");
		click(screenSize);
		WebElement size = locateElement("xpath","//div[text()='48 - 55']");
		click(size);
		Thread.sleep(3000);
		WebElement firstTV = locateElement("xpath","(//div[@class='_3wU53n'])[1]");
		click(firstTV);
		Thread.sleep(3000);
		switchToWindow(1);
		Thread.sleep(3000);
		WebElement compare = locateElement("xpath","(//div[@class='_1p7h2j'])[1]");
		click(compare);
		closeBrowser();
		switchToWindow(0);
		WebElement secondTV = locateElement("xpath","(//div[@class='_3wU53n'])[2]");
		click(secondTV);
		switchToWindow(1);
		WebElement compare1 = locateElement("xpath","(//div[@class='_1p7h2j'])[1]");
		click(compare1);
		WebElement compareButtton = locateElement("xpath","//span[text()='COMPARE']");
		click(compareButtton);
		Thread.sleep(3000);
		WebElement firstTVPrice = locateElement("xpath","(//div[@class='_1vC4OE'])[1]");
		String firstPrice1 = getText(firstTVPrice);
		WebElement secondTVPrice = locateElement("xpath","(//div[@class='_1vC4OE'])[2]");
		String secondprice =getText(secondTVPrice);
		int Price1 = Integer.parseInt(firstPrice1.replaceAll("[^0-9]", ""));
		int Price2 = Integer.parseInt(secondprice.replaceAll("[^0-9]", ""));
		System.out.println("Price of First TV is " + Price1);
		System.out.println("Price of Second TV is " + Price2);
		if(Price1 > Price2)
		{
			WebElement buynow = locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[2]");
			click(buynow);
		}else
		{
			WebElement buynow1 = locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[1]");
			click(buynow1);
		}
		
		
		
		
		
			
}
}