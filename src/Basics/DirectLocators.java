package Basics;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// Finding element with "name" locator
//		driver.findElement(By.name("q")).sendKeys("Mobile");
//		Thread.sleep(3000);

		
		//selecting element wsing "id" locator
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(50000);
		driver.close();
		
	}
}
