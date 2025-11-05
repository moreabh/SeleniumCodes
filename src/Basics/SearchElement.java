package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchElement {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		WebElement searchfield = driver.findElement(By.tagName("Input"));
		searchfield.sendKeys("Palystation 5");
		
		driver.findElement(By.className("button-1")).click(); 
		Thread.sleep(2000);
		driver.close();
		
	}
}
