package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySelected 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		excellent.click();
		
		if (excellent.isSelected()) 
		{
			System.out.println("Excellent button is selected");
			System.out.println("Test case is pass");
			
		} 
		else 
		{

			driver.close();
			throw new Exception("Excellent button is not selected and test case is fail"); 
		}
		
		driver.close();
		
	}
}
