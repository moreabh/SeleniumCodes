package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationDemoRegister {


	public static WebDriver driver =null;
	@BeforeMethod
	public void main() throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);	
	}
	@Test
	public void register() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("More");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ichalkaranaji");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abhi@gamil.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9373408741");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		
		WebElement skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select skills1 = new Select(skills);
		Thread.sleep(2000);
		skills1.selectByVisibleText("Java");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='India']")).click();	
		
		//year
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		year.click();
		Select year1 = new Select(year);
		year1.selectByVisibleText("2002");
		Thread.sleep(3000);
		
		//month
		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		month.click();
		Select month1 = new Select(month);
		month1.selectByVisibleText("August");
		Thread.sleep(2000);
		
		//day
		WebElement day = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		day.click();
		Select day1 = new Select(day);
		day1.selectByVisibleText("13");
		Thread.sleep(2000);
		
		//password
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Pass@123");
		//confirm password
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Pass@123");
		
		//submit
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
}
