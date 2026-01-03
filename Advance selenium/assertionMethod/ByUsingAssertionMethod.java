package assertionMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ByUsingAssertionMethod {
	@Test
	public void main() throws InterruptedException {
	
		String expectedLanding_Page = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String actual_landingPage = driver.getCurrentUrl();
		assertEquals(actual_landingPage,expectedLanding_Page,"I am not in login page");
		Reporter.log("I am in login page",true);
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			
			String actualHome_Page = driver.getCurrentUrl();
			assertNotEquals(actualHome_Page, expectedLanding_Page,"login is unsuccessfull");
			Reporter.log("login successfull", true);
			
		driver.close();
	}
}

