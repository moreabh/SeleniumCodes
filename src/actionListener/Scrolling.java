package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		Actions act = new Actions(driver);
		
//		act.scrollByAmount(0, 250).perform();
		
		 WebElement feature_scroll = driver.findElement(By.xpath("//strong[text()=\"Featured products\"]"));
		 act.scrollToElement(feature_scroll).perform();
		 Thread.sleep(2000);
		
		driver.close();
	}
}
