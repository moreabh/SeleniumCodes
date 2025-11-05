package popUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseClass;

public class MultipleChildPages extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String expected_url = "";
		preCondition();
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		 List<WebElement> ecommerce_link = driver.findElements(By.xpath("//a[@target=\"_blank\"]"));
		 for (WebElement webElement : ecommerce_link) {
			webElement.click();
			Thread.sleep(1000);
		}
		 Thread.sleep(1000);
		 Set<String> childHandle = driver.getWindowHandles();
		 System.out.println(childHandle);
		 
		 for (String string : childHandle) {
			driver.switchTo().window(string);
			
			String actual_url = driver.getCurrentUrl();
			
			if (expected_url.equals(actual_url)) {
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			} 
		}
		 
		 driver.quit();
		
	}
}
