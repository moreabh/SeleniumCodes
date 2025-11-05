package WebElementMethod;

import java.awt.font.TextHitInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
//		Thread.sleep(3000);
		
//		xpath by group of index
//		driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[4]")).click();
//		Thread.sleep(3000);
		
//		xpath by independant and depedant element
		WebElement laptop14 = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop']/../../div[3]/div/span)"));
		System.out.println(laptop14.getText());
		Thread.sleep(3000);
		
		driver.close();
	}
}
