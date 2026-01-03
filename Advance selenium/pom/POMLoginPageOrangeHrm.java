package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;

public class POMLoginPageOrangeHrm {
	@Test
	public static void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Login log = new Login(driver);
		log.username.sendKeys("Admin");
		log.password.sendKeys("admin123");
		log.login_button.click(); 
		Thread.sleep(2000);
		
		driver.close();
	}

}
