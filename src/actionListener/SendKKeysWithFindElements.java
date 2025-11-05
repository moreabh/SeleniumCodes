package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKKeysWithFindElements {

	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		act.sendKeys(searchField, "Chaiii").keyDown(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.close();
	}
}
