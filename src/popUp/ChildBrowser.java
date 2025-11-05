package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseClass;

public class ChildBrowser extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		 String parentHandle = driver.getWindowHandle();
		 System.out.println(parentHandle);
		 Thread.sleep(2000);
		 
		 WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		 Actions act = new Actions(driver);
		 act.scrollToElement(facebook).perform();
		 facebook.click();
		  Set<String> childHandle = driver.getWindowHandles();
		 System.out.println(childHandle);
		 childHandle.remove(parentHandle);
		 
		 for (String string : childHandle) {
			
			 driver.switchTo().window(string);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		 Thread.sleep(3000);
		 driver.quit();
		 
	}
}
