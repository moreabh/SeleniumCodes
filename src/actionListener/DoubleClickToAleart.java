package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickToAleart {

	public static void main(String[] args) throws Exception {
		String expected_Url = "https://demo.guru99.com/test/simple_context_menu.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		String actual_Url = driver.getCurrentUrl();
		
		if (expected_Url.equals(actual_Url)) {
			System.out.println("Verified!!");
			Actions act = new Actions(driver);
			WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			act.doubleClick(doubleClick).perform();
			Thread.sleep(3000);  
		} 
		else {
			driver.close();
			throw new Exception("Fail to verify");
		}
	
		driver.quit();
		
	}
}
