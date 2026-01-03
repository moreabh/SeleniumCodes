package assertionMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFile;

public class BaseClass {

	public static WebDriver driver = null;
	@BeforeClass 
	public void precondition() throws InterruptedException, IOException {
		String browser = ReadFile.propertiesFile("browser");
		String url = ReadFile.propertiesFile("url");
		
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
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(2000);
	}
	
	@BeforeMethod	
	public void login() throws InterruptedException, IOException {
		
		String username = ReadFile.propertiesFile("username");
		String password = ReadFile.propertiesFile("password");
			 WebElement usernameTextfield = driver.findElement(By.name("username"));
			usernameTextfield.sendKeys(username);
			
		 	WebElement passwordTextfield = driver.findElement(By.name("password"));
		 	passwordTextfield.sendKeys(password);
		 		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				Thread.sleep(2000);			
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		  
		 driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
		    Thread.sleep(2000);
	}
	@AfterClass
	public void postcondition() {
		
		driver.quit();
	}			
	
}
