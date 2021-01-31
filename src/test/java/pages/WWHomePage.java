package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WWHomePage {
	
	
	private static WebElement element = null;
	
	public static WebElement drop_down_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@class='Button_button__RwVHT MenuItem_menu-item__link__2qTtx SecondaryMenu_menuItem__1m5Ya Button_button--no-style__3CpTl']/.//span[@data-e2e-name='attend']"));
		
		return element;
	}
	
	
	public static WebElement select_workshop(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@role='cell']/a[@href='https://www.weightwatchers.com/us/find-a-workshop/']"));
		
		return element;
	}


}
