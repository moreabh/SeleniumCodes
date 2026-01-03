package execution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Admin {

	@Test(groups = "integration")
	public void tc__005() {
		Reporter.log("I'm Admin tc__005",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		driver.close();
	}
	
	@Test(groups = "integration")
	public void tc__006() {
		Reporter.log("I'm Login tc__006",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.meesho.com/");
		driver.close();
	}
}
