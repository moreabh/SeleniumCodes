package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'u_0_8_')]")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).sendKeys("Rana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id=\"sex\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_h_')]")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Raj@123");
		
		WebElement selectDay = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select day = new Select(selectDay);
		
		Thread.sleep(2000);
		day.selectByIndex(1);
		Thread.sleep(2000);
		day.selectByVisibleText("4");
		Thread.sleep(2000);
		day.selectByValue("6");
		Thread.sleep(2000);
//		day.deselectByIndex(1);
//		
//		Thread.sleep(2000);
//		day.deselectByVisibleText("4");
//		Thread.sleep(2000);
//		day.deselectByValue("6");
//		Thread.sleep(2000);
	    //day.deselectAll();
		
		WebElement selectMonth = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month = new Select(selectMonth);
		
		Thread.sleep(2000);
		month.selectByIndex(1);
		Thread.sleep(2000);
		month.selectByVisibleText("Aug");
		Thread.sleep(2000);
		month.selectByValue("4");
		Thread.sleep(2000);
		
		
		WebElement selectYear = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select year = new Select(selectYear);
		
		Thread.sleep(2000);
		year.selectByIndex(1);
		Thread.sleep(2000);
		year.selectByVisibleText("2022");
		Thread.sleep(2000);
		year.selectByValue("2016");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_n_')]")).click();
		driver.close();
		
		
		
		
		
		
		
	}

}