package annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@DataProvider(name="user")
	 public Object[][] sender(){

			Object[][] obj = new Object[5][1];

			obj[0][0] = "Admin";
			obj[1][0] = "mani";
			obj[2][0] = "abhi";
			obj[3][0] = "pityya";
			obj[4][0] = "jackss";
		
	return obj;	
	}


	@Test (dataProvider = "user")
	public void receiver(String username) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		
	driver.close();

	}

}
