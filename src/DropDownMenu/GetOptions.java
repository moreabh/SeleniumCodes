package DropDownMenu;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/morea/Downloads/demo.html");
		Thread.sleep(2000);
		
		WebElement single_Select = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(single_Select);
		
		List<WebElement> cars = sel.getOptions();
		
		for (WebElement web : cars) {
			
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();
		
	}
}
