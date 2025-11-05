package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextFieldOrangeHRM {

	 public static void main(String[] args) throws Exception {
		
		 String data = "Admin";
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//input[@name='username'])")).sendKeys("Admin");
		 driver.findElement(By.xpath(" (//input[@type='password'])")).sendKeys("admin123");
		 driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		 Thread.sleep(6000);
		 

			WebElement searchfield = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])"));
			
			searchfield.click();
			searchfield.sendKeys(data);
			Thread.sleep(4000);
			
			String currentData = searchfield.getAttribute("value");
			
			if (data.equals(currentData)) {
				System.out.println("both are equal and test case pass");
			}
			else 
			{
				driver.close();
				throw new Exception("both are not equal and TestCase Fail");

			}
			
			//logout
			driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@class=\"oxd-userdropdown-link\"])/../../../../../ul/li/ul/li[4]/a")).click();
			Thread.sleep(000);
		 driver.close();
	}
}
