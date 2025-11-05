package veriyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsVerifyRemove {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_text = "3rd Album";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[5]/a")).click();
		//adding album to the cart
		driver.findElement(By.xpath("(//a[contains(text(),'3rd Album')])/../../../div[2]/div[3]/div[2]")).click();
		Thread.sleep(4000);
		//adding music 2 to the cart
		driver.findElement(By.xpath("(//a[contains(text(),'3rd Album')])/../../../../../div[2]/div/div[2]/div[3]/div[2]")).click();
		Thread.sleep(4000);
		//adding music 2 to the cart
		driver.findElement(By.xpath("(//a[contains(text(),'3rd Album')])/../../../../../div[3]/div/div[2]/div[3]/div[2]")).click();
		Thread.sleep(4000);
		//clicking to shopping cart
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		
		String actual_text = driver.findElement(By.xpath("(//a[@class='product-name'])[1]")).getText();
		System.out.println("Actual Text: "+actual_text);
		System.out.println("Expeced Text:"+expected_text);
		Thread.sleep(2000);
		
	if (expected_text.equals(actual_text)) {
		System.out.println("Product Is Not Removed");
	} 
	else {
		System.out.println("Product Is Removed");

	}
		
		Thread.sleep(3000);
				
		driver.close();
	}
}
