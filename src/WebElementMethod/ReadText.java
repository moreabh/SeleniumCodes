package WebElementMethod;

//import java.net.http.WebSocket;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Read Text
		WebElement cart  = driver.findElement(By.className("ico-cart"));
		System.out.println(cart.getText());
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
