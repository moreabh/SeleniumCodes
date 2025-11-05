package veriyPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {

	public static void main(String[] args) {
	
		String expected_Url = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_Url = driver.getCurrentUrl();
		System.out.println("Current Url: "+actual_Url);
		
		if (expected_Url.equals(actual_Url)) {
			System.out.println("i am  on targeted page");
			System.out.println("Ready to do action");
			
		} 
		else {
			 System.out.println("i am not in targeted page");
			 System.out.println("defects found");
		 
		}
		
		driver.close();
	}
}
