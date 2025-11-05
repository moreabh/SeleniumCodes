package findElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceAtFooter {

	public static void main(String[] args) throws InterruptedException {
		
		//String actual_text = "RSS";
		String rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> follow = driver.findElements(By.xpath("//div[@class=\"column follow-us\"]/ul/li/a"));
		
		
		for (WebElement web : follow) {
			String actual_url = driver.getCurrentUrl();
			if (actual_url.equals(rss_url)) {
				driver.navigate().back();
				
			}
			web.click();
			Thread.sleep(2000);
			
		}
			driver.close();	
		}
		
	}
