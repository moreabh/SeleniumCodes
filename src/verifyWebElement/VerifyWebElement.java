package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElement {

	public static void main(String[] args) throws Exception {
		 WebDriver driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		 
		 if (excellent.isEnabled()) {
			 
			 System.out.println("Excellent radio button is enabled");
			 System.out.println("Pass");
			 excellent.click();
			 Thread.sleep(2000);
			 
		} 
		 else {
			 driver.close();
			 throw new Exception("Excellent element is not enabled testScrip is Fail"); 
		}
		 
		 driver.close();
		 
	}
}

