package DropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopContineousSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])")).click();
		
		WebElement sort_By = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sort_By);
		
		List<WebElement> position = sel.getOptions();
		
		int i=0;
		for (WebElement web : position) {
			
			sort_By = driver.findElement(By.id("products-orderby"));
			sel = new Select(sort_By);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}
}
