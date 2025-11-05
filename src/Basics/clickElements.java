package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-wishlist")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
