package assertionMethod;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionRealTImeExample  {

	public static WebDriver driver = null;
	public static String browser = "chrome";
	@Test
	public void main() throws InterruptedException {
		
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			
		}
		
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else {
			 driver = new ChromeDriver();	
		}
		
		assertNotNull(driver, "driver is null");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//login
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
		driver.findElement(By.className("ico-cart")).click();
		
		
		List<WebElement> product = driver.findElements(By.xpath("//a[text()=\"3rd Album\"]"));
		assertTrue(0<product.size(), "Product is not added into the cart and testcase failed");
		Reporter.log("Product is added and test case pass",true);
		driver.close();
		soft.assertAll();
	}
}
