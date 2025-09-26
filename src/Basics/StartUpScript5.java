package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sheinindia.in/?srsltid=AfmBOorGDSu-RdMNKnb1dcUOM4g-c2LdGAJpSciUEXCY61yF3mB75D0-");
		driver.close();
	}
}
