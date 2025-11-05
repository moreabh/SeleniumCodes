package findElementsMethod;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsByForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		List<WebElement> community_Poll = driver.findElements(By.name("pollanswers-1"));
		
		for (WebElement web : community_Poll) {
			
			web.click();
			Thread.sleep(2000);
		}
		
		driver.close();
		
	}
}
