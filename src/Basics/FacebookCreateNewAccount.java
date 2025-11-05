package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateNewAccount {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(5000);
		 
		 //PartialLinkText
//		 driver.findElement(By.partialLinkText("Create")).click();
//		 Thread.sleep(5000);
		 
		 driver.findElement(By.name("firstname")).sendKeys("Abhi");
		 Thread.sleep(5000);
		 
		 driver.close();
		 
	}
}
