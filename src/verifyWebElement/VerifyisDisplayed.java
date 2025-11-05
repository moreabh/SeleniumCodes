package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyisDisplayed {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.className("ico-register"));
		
		if (register.isDisplayed()) {
			register.click();
			System.out.println("Pass");
		}
		else {

			driver.close();
			throw new Exception("Register is not displayed and test case is fail");
		}
		
		driver.close();
	}
}
