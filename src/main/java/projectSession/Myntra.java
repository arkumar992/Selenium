package projectSession;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Myntra extends SeMethods {

	@Test
	public void myntraSite() {
		startApp("chrome", "https://www.myntra.com/");
		//dismissAlert();
		WebElement search = locateElement("class","desktop-searchBar");
		type(search,"Sunglasses");
		WebElement clickSearch = locateElement("class","desktop-submit");
		click(clickSearch);
		
		WebElement clickSearch1 = locateElement("class","brand-more");
		click(clickSearch1);
				
		WebElement iframes = locateElement("class","FilterDirectory-list");
		String brandName = iframes.getText();
		System.out.println(brandName);
		WebElement disCount = locateElement("xpath","//input[@value='40.0']");
		click(disCount);
		WebElement count = locateElement("xpath","//h1[text()='Sunglasses']/following::span[1]");
		
		String count1 = count.getText();
		System.out.println(count1);
		int count2 = Integer.parseInt(count1.replaceAll("^[0-9]", ""));
		System.out.println(count2);
		
		WebElement unisex = locateElement("xpath","//h4[contains(text(),'Unisex')]");
		System.out.println(unisex.getSize());
		
		
	}
}
