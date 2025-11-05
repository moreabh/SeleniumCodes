package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//cssSelector
//		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//		Thread.sleep(5000);
		
		
		//shortcut for cssSelector
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tab");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
