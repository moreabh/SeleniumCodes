package actionListener;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FillRegisterFormWithoutUsingFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	
		Actions act = new Actions(driver);
		
		//click to register
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		for (int i = 0; i < 25 ; i++) {
			
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(100);
		}
		//click to Male
		act.sendKeys(Keys.SPACE).perform();
		act.keyDown(Keys.ENTER).perform();
		//firstname
		act.sendKeys("abhi").perform();
		act.keyDown(Keys.ENTER).perform();
		//lastname
		act.sendKeys("more").perform();
		act.keyDown(Keys.ENTER).perform();
		//mail
		act.sendKeys("abhi@gmail.com").perform();
		act.keyDown(Keys.ENTER).perform();
		//password
		act.sendKeys("abhisdj").perform();
		act.keyDown(Keys.ENTER).perform();
		//confirm password
		act.sendKeys("abhisdj").perform();
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}
	
}
