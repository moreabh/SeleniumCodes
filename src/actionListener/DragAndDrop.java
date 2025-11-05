package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("node"));
		WebElement target = driver.findElement(By.id("droparea"));
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		
		WebElement source2 = driver.findElement(By.id("mongo"));
		WebElement target2 = driver.findElement(By.id("droparea"));
		act.dragAndDrop(source2, target2).perform();
		
		Thread.sleep(2000);
		WebElement source3 = driver.findElement(By.id("angular"));
		WebElement target3 = driver.findElement(By.id("droparea"));
		act.dragAndDrop(source3, target2).perform();
		
		//using click and hold and release
//		act.clickAndHold(source).release(target).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
