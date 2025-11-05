package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextField {

	public static void main(String[] args) throws Exception {
		String data = "selenium";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		searchfield.sendKeys(data);
		
		String currentData = searchfield.getAttribute("value");
		
		if (data.equals(currentData)) {
			System.out.println("both are equal and test case pass");
		}
		else 
		{
			driver.close();
			throw new Exception("both are not equal and TestCase Fail");

		}
		driver.close();
	}
}
