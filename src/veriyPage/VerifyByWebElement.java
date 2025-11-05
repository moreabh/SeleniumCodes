package veriyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		try {
			
			WebElement poll = driver.findElement(By.xpath("//strong[text()='Community pol']"));
			System.out.println("Pass");
		}
		catch (Exception e) {
			
			driver.close();
			throw new Exception("Fail");
		}
		
		driver.close();
	}
}
