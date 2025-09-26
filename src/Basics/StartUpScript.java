package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {

	public static void main(String[] args) {
		
			//Open The browser
//			ChromeDriver driver = new ChromeDriver();
			WebDriver driver = new ChromeDriver();
			
			//Maximize the browser 
			driver.manage().window().maximize();
			
			//enter into dws(Demo Web shop)
			driver.get("https://demowebshop.tricentis.com/");
			
			//close the browser
			driver.close(); 

	}

}
