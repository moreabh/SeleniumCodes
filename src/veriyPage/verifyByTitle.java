package veriyPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyByTitle {

	public static void main(String[] args) {
		
		String expeccted_title = "Demo Web Shop";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_title = driver.getTitle();
		System.out.println("Actual_Title: "+actual_title);
		
		if (expeccted_title.equals(actual_title)) {
			System.out.println("i am on targeted Page");
			 System.out.println("Ready to do action");
			
		} 
		else {
			System.out.println("i am not in my targeted page");
			System.out.println("Defect occured");

		}
		driver.close();	
	}
}
