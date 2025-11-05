package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(right);
		Thread.sleep(3000);
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		act.click(copy).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
