package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SkipTestCase {
	@Test
	public void csk() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
	}
	@Test
	public void mi() { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mumbaiindians.com/");
	}
	@Test(enabled = false)
	public void rcb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
	}

}
