package findElementsMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximumPrice {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]/a")).click();
		  Thread.sleep(2000);
		  List<WebElement> buttons = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		  for (WebElement web : buttons) {
			  web.click();
			  Thread.sleep(3000);
			//  driver.navigate().back();
			  
			
		}
		  Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='cart-label']")).click();
			String qty = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		  Thread.sleep(2000);
		  List<Double>intList = new ArrayList<>();
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		 for ( WebElement web : price) {
			 
			 String pricetext = web.getText();
			 Double priceval = Double.parseDouble(pricetext);
			 intList.add(priceval);
			
		}
		 double maxprice=Collections.max(intList);
		 int index = intList.indexOf(maxprice);
		
		List<WebElement> removebox = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		removebox.get(index).click();
		
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		String qty2 = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		
		if (qty.equals(qty2)) {
			System.out.println("Product not removed");
		}
		else {
			System.out.println("Product removed successfully");

		}
		 
	 Thread.sleep(2000);
		  driver.close();
	}
}