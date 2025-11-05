package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.clickElements;

public class ProductAddingToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Abhi");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("Abhi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Xyz");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("How Are You?");
		Thread.sleep(1000);
		
		//clearing Quantity and adding 2 Quantity
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(2000);
		
		//Adding Product to cart
		driver.findElement(By.cssSelector(".button-1.add-to-cart-button")).click();
		Thread.sleep(2000);
		
		//Entering into Shopping Cart
		driver.findElement(By.cssSelector("span[class='cart-label]")).click();
		Thread.sleep(2000);
		
		//click for remove
		driver.findElement(By.className("remove-from-cart")).click();
		Thread.sleep(2000);

		//Updating The Shopping cart
		driver.findElement(By.cssSelector(".button-2.update-cart-button")).click();
		Thread.sleep(5000);
		
		
		driver.close();
	}
}
