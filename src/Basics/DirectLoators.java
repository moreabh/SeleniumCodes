package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLoators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchfield = driver.findElement(By.tagName("Input"));
		searchfield.sendKeys("Palystation 5");
		Thread.sleep(10000);
		driver.close();

	}

}
