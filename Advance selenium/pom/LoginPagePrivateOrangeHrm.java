package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.LoginPagePrivate;

public class LoginPagePrivateOrangeHrm {
	@Test
	public static void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPagePrivate log = new LoginPagePrivate(driver);
		
		log.username("Admin");
		log.password("admin123");
		log.login_button();
		Thread.sleep(2000);
		
		driver.close();	
	}
}
