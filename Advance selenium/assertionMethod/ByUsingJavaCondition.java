package assertionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingJavaCondition {

	 public static void main(String[] args) throws Exception {
		String expectedLanding_Page = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String actual_URL = driver.getCurrentUrl();
		if (actual_URL.equals(expectedLanding_Page)) {
			System.out.println("I am in Login");
			
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			
			String actualHome_Page = driver.getCurrentUrl();
			if (expectedLanding_Page.equals(actualHome_Page)) {
				
				driver.close();
				throw new Exception("login is Unsuccessfull");
			}
			else {
				System.out.println("Login is Successfull");
			}	
		}
		else {
			driver.close();
			throw new Exception("i am not in login page ");
			
		}
		driver.close();	
	}
}
