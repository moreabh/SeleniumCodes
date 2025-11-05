package WebElementMethod;

import java.awt.font.TextHitInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//xpath by attribute
		driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
		Thread.sleep(2000);
		
		//xpath by text function
		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		System.out.println(poll.getText());
		Thread.sleep(2000);

		//xpath by contains function
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("laptop");
		Thread.sleep(2000);
		
		driver.close();
	}
}
