package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.xpath("//input [@id=\"identifierId\"]")).sendKeys("moreabhishek79529@gmail.com");
		driver.findElement(By.xpath("//span [text()='Next']")).click();
		driver.findElement(By.xpath("//div [text()='Enter your password']")).sendKeys("pass@134");
		driver.findElement(By.xpath("//span [text()='Next']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
