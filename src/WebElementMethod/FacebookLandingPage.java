package WebElementMethod;

import java.awt.font.TextHitInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLandingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).sendKeys("More");
		Thread.sleep(1000);
		

		driver.findElement(By.id("day")).sendKeys("13");Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("Aug");Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("2002");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_h_')]")).sendKeys("Abhi@gmail.com");Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='password_step_input']) [1]")).sendKeys("@Pass1234");
		
		Thread.sleep(5000);
		
		
		driver.close();
	}
}
