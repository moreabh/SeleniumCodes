package Basics;

import java.util.Iterator; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException  {
	for (int i = 0; i < 5; i++) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/big-billion-days-store");
		Thread.sleep(1000);
		driver.close();
		
		
	}
}
}
