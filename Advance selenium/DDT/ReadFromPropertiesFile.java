 package DDT;

import static org.testng.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadFromPropertiesFile {
	@Test
	public void main() throws IOException, InterruptedException {
		//create object for properties class
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\configuratonFile.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);   
		
		
		//
		WebDriver driver = null;
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
		driver.get(url);
		
		//login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
}
