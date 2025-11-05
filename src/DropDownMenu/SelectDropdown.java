package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/morea/Downloads/demo.html");
		Thread.sleep(2000);
		
		WebElement single_Select = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(single_Select);
		
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByVisibleText("BMW");
		Thread.sleep(1000);
		sel.selectByValue("for");
		
		driver.close();
	
		
		
	}
}
