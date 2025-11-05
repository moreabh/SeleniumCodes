package utility;

import org.openqa.selenium.By;

public class SearchField extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		login();
		Thread.sleep(2000);
		
		//Go to searchField 
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(3000);
		
		logout();
		postCondition1();
		
	}
}
