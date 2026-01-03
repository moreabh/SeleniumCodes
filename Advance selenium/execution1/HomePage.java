package execution1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePage {
	@Test(groups = "functional")
	public void tc_003() {
		Reporter.log("I'm HomePage tc__003",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.close();
		
	}
	
	@Test(groups = "functional")
	public void tc__004() {
		Reporter.log("I'm Homepage tc__004",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.orangehrm.com/");
		driver.close();
	}

}
