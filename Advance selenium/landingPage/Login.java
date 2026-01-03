package landingPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test (priority = 0)
	public void tc_01() throws Exception {
		String username = "Admin";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usernameTextfield = driver.findElement(By.name("username"));
	    usernameTextfield.sendKeys(username);
	    
	    String currentData = usernameTextfield.getAttribute("value");
	   
	    if (currentData.equals(username))
	    {
			System.out.println("data successfully passed");
		} else {
			driver.close();
			throw new Exception("Data is not passed inside username textfield and TestCase Fail");
		}
	    driver.close();
	    
	}
	@Test (priority = 1)                                                                                        
	public void tc_02() throws Exception {
		String password = "admin123";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement passwordTextfield = driver.findElement(By.name("password"));
	    passwordTextfield.sendKeys(password);
	    
	    String currentData = passwordTextfield.getAttribute("value");
	   
	    if (currentData.equals(password))
	    {
			System.out.println("data successfully passed");
		} else {
			driver.close();
			throw new Exception("Data is not passed inside password textfield and TestCase Fail");
		}
	    
	   driver.close();
	}
	@Test (priority = 2)
	public void tc_03() throws Exception {
		String username = "Admin";
		String password = "admin123";
		String actualURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usernameTextfield = driver.findElement(By.name("username"));
	    usernameTextfield.sendKeys(username);
		WebElement passwordTextfield = driver.findElement(By.name("password"));
	    passwordTextfield.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
		Thread.sleep(2000);
	    	String currentURL = driver.getCurrentUrl();

	   
	    if (actualURL.equals(currentURL))
	    {
			System.out.println("Login successfully");
		} else {
			driver.close();
			throw new Exception("Data is not passed login Fail");
		}
	    
	    driver.close();
		
	}
}
