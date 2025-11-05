package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//click an element
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("ico-wishlist")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
