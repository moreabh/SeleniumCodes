package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsGetTextPrice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		
		WebElement price1 = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(price1.getText());
		
		WebElement price2 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
		System.out.println(price2.getText());
		
		WebElement price3 = driver.findElement(By.xpath("//a[text()='Music 2']/../../../../../div[3]/div/div[2]/div[3]/div/span"));
		System.out.println(price3.getText());
		
		
		WebElement price4 = driver.findElement(By.xpath("//a[text()='Music 2']/../..following-sibling::"));
		System.out.println(price3.getText());
		
		
		Thread.sleep(2000); 
		driver.close();
	}
}
