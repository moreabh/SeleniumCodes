package veriyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsProductAddedVerifying {

	public static void main(String[] args) throws InterruptedException {
		
		
		String expected_Text = "Build your own cheap computer";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//login
		driver.findElement(By.xpath("(//a[@class='ico-login'])")).click();
		driver.findElement(By.xpath("(//input[@class='email'])")).sendKeys("abhishek18@gmail.com");
		driver.findElement(By.xpath("(//input[@id='Password'])")).sendKeys("Pass@123");
		driver.findElement(By.xpath("(//input[@value='Log in'])")).click();
		
		//adding the product to shopping cart
		driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])/../../../../../../div[4]/div/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(@for,'product_attribute_72_5_18_65')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(@for,'product_attribute_72_6_19_55')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(@for,'product_attribute_72_3_20_58')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(@for,'product_attribute_72_8_30_95')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'addtocart_72_EnteredQuantity')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'addtocart_72_EnteredQuantity')]")).sendKeys("3");
		
		driver.findElement(By.xpath("//input[contains(@class,'button-1 add-to-cart-button')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(2000);
		
		//verifying 
		
		String actual_text = driver.findElement(By.className("product-name")).getText();
		System.out.println("Actual Text:"+actual_text);
		
		if (expected_Text.equalsIgnoreCase(actual_text)) {
			
			 System.out.println("Product Is Successfully added to cart");
		}
		else {

			System.out.println("Product Is Missing");
		}
		
		
		driver.findElement(By.xpath("(//a[@class='ico-logout'])")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
