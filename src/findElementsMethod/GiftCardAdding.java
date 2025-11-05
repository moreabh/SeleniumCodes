package findElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardAdding {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();        
        driver.get("https://demowebshop.tricentis.com/");       
        driver.findElement(By.partialLinkText("Gift Cards")).click();
        Thread.sleep(2000);
        for (int i = 0; ; i++)
        {
        	try{
        		List<WebElement> productItems = driver.findElements(By.xpath("(//div[@class=\"add-info\"])/div[2]/input"));
                WebElement currentProduct = productItems.get(i);            
                currentProduct.click();
                Thread.sleep(2000);
                
                driver.findElement(By.cssSelector(".recipient-name")).sendKeys("Ram");
                driver.findElement(By.cssSelector(".sender-name")).sendKeys("Abhi");
                driver.findElement(By.xpath("(//textarea[@class =\"message\"])")).sendKeys("stay happy");
                
                if(!driver.findElements(By.cssSelector(".recipient-email")).isEmpty()) 
                {
                    driver.findElement(By.cssSelector(".recipient-email")).sendKeys("ram1@gmail.com");
                    driver.findElement(By.cssSelector(".sender-email")).sendKeys("abhi@gmail.com");
                }              
                driver.findElement(By.cssSelector("input.add-to-cart-button")).click();
                Thread.sleep(2000);
                driver.navigate().back();
                Thread.sleep(2000);
            }
            
            catch (IndexOutOfBoundsException e) 
            {
            	System.out.println("All products added");
                break;
            }
        }  
        Thread.sleep(3000);
        driver.close();
	}
}
	
