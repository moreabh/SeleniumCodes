package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
//	@Test(priority = 3)
//	public void csk() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.chennaisuperkings.com/");
//	}
//	@Test(priority = 1,invocationCount = 4,threadPoolSize = 2)
//	public void mi() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.mumbaiindians.com/");
//	}
	@Test(priority = 0 , invocationCount = 4,threadPoolSize = 2)
	public void rcb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
	}
	
//	@Test
//	public void testCase(){
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		
//	}
}
				