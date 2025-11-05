package actionListener;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickWebElementWithoutLocators {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(4000);
		
		//verify
		String actual_url = "https://demowebshop.tricentis.com/register";
		String current_url = driver.getCurrentUrl();
		if (actual_url.equals(current_url)) 
		{
			System.out.println("testcase passed!!");
			
		} 
		else {
			driver.close();
			throw new Exception("testcase fail!!!");
		}
		
		driver.close();
	}
}
