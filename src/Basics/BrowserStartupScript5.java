package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStartupScript5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.sheinindia.in/?srsltid=AfmBOorGDSu-RdMNKnb1dcUOM4g-c2LdGAJpSciUEXCY61yF3mB75D0-");
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
