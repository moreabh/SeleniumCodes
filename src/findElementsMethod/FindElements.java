package findElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> community_Poll = driver.findElements(By.name("pollanswers-1"));
		community_Poll.get(0).click();   Thread.sleep(2000);
		community_Poll.get(3).click();
		
		driver.close();
	}
}
