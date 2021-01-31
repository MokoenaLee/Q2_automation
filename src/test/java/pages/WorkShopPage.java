package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkShopPage {
	
	private static WebElement element = null;
	
	public static WebElement studio_select_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@id='search-container']/div[@class='toggler-_3gl1']/./div[@class='buttonWrapper-QK2gi']/button[@class='toggleButton-2ikVW']"));
		
		return element;
	}
	
	public static WebElement studio_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@id='search-container']/./form[@data-testid='no-gp']/./div[@class='ww comboInput-1v8dh']/div[@class='ww input input-3TfT5']/input[@id='location-search']"));
		
		return element;
	}
	
	public static WebElement studio_search_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@id='search-container']/./form[@data-testid='no-gp']/./div[@class='ww comboInput-1v8dh']/button[@id='location-search-cta']"));
		
		return element;
	}
	
	public static WebElement first_search_location(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='outerContainer-2q7to']/div[@class='resultContainer-m4u0m']/div[@class='wrapper-2w6O_']/div[@id='search-results']/div[@id='location-1180510']"));
		
		return element;
	}
	

	
	
	

}
