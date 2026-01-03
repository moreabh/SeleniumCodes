package execution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Leave {

	@Test(groups = "Resting")
	public void tc__007() {
		Reporter.log("I'm Login tc__007",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
		driver.close();
		
	}
	
	@Test(groups = "Resting")
	public void tc__008() {
		Reporter.log("I'm Login tc__008",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.swiggy.com/");
		driver.close();
	}
}
