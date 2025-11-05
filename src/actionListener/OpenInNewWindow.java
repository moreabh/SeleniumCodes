package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		Actions act = new Actions(driver);
		WebElement apparel_shoes = driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
		//shift use for open in new window
		
		act.keyDown(Keys.SHIFT).click(apparel_shoes).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
