package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificStudioPage {
	
	static List<WebElement> element = null;
	
	/**public static WebElement business_hours(WebDriver driver) {
		
		element = (List<WebElement>) driver.findElement(By.xpath("//div[@class='hours-IVyrp']/.//div[@class='title-3o8Pv']"));
		
		return (WebElement) element;
	}**/
	
	public static List<WebElement> business_hours_options(WebDriver driver) {
		
		element = driver.findElements(By.xpath("//div[@class='hoursWrapper-1KHIv show-1db4o']/.//div[@class='day-CZkDC']"));
		
		return element;
	}


}
