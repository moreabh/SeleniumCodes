package Basics;

import java.awt.font.TextHitInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DWSRegisterPageAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Click On register
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("FirstName")).sendKeys("Abhishek"); Thread.sleep(1000); //First name	
		driver.findElement(By.name("LastName")).sendKeys("More"); Thread.sleep(1000); // Last Name
		driver.findElement(By.name("Email")).sendKeys("abhishek79529@gmail.com"); Thread.sleep(1000); //Email
		driver.findElement(By.id("Password")).sendKeys("Demo@123"); Thread.sleep(1000); //password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Demo@123"); Thread.sleep(1000);// confirm password 
		driver.findElement(By.id("register-button")).click(); Thread.sleep(5000); //Register button
		driver.close();
		
	}
}
