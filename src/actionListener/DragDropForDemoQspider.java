package actionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropForDemoQspider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement mouse_actions = driver.findElement(By.xpath("//section[text()=\"Mouse Actions\"]"));
//		act.scrollToElement(mouse_actions).perform();
		//clicked on mouse actions
		act.click(mouse_actions).perform();
		Thread.sleep(2000);
		
		//clicked on drag and drop
		WebElement drag_drop = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		act.click(drag_drop).perform();Thread.sleep(2000);
		
		//clicked on drag position
		WebElement drag_Position = driver.findElement(By.xpath("//a[text()='Drag Position']"));
		act.click(drag_Position).perform();Thread.sleep(2000);
		
		//mobile accessories
		WebElement mobile_Area = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement mobile_charger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobile_Cover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.dragAndDrop(mobile_charger,mobile_Area).perform();Thread.sleep(2000);
		act.dragAndDrop(mobile_Cover,mobile_Area).perform();Thread.sleep(2000);
		
		//laptop accessories
		WebElement laptop_Area = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement laptop_Charger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement laptop_Cover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		act.dragAndDrop(laptop_Charger,laptop_Area).perform();Thread.sleep(2000);
		act.dragAndDrop(laptop_Cover,laptop_Area).perform();
		
		Thread.sleep(6000);
		
		
		driver.close();
		
		
	}
}
