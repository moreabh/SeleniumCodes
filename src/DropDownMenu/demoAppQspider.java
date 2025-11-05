package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoAppQspider {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class=\"text-[#000000] text-[0.75rem] mt-2\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//section[@class=\"poppins text-[15px]\"])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[contains(text(),'Login 1.0')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"p-3 w-72 rounded border-none text-lg\"])[1]")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"p-3 w-72 rounded border-none text-lg\"])[2]")).sendKeys("Raj@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"reg\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"reg\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Login 2.0')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"p-3 w-72 rounded border-none text-lg\"])[1]")).sendKeys("Ram");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"p-3 w-72 rounded border-none text-lg\"])[2]")).sendKeys("Ram@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"w-5 h-5 bg-gray-300 rounded-full\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"w-5 h-5 bg-gray-300 rounded-full\"])[2]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Login 3.0')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.className("[class=\"input_26 p-3 w-72 rounded border-none text-lg\"]")).sendKeys("Raj");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class=\"pass_959 p-3 w-72 rounded border-none text-lg\"]")).sendKeys("Pass@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        
		
	}

}