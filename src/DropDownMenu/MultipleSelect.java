package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/morea/Downloads/demo.html");
		Thread.sleep(2000);
		
		WebElement multiple_Select = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiple_Select);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByVisibleText("BMW");
		Thread.sleep(1000);
		sel.selectByValue("for");
		Thread.sleep(3000);
		
		//deselect
		
//		sel.deselectByIndex(1);
//		Thread.sleep(1000);
//		sel.deselectByVisibleText("BMW");
//		Thread.sleep(1000);
//		sel.deselectByValue("for");
		
		//deselectall
		
		sel.deselectAll();
		
		driver.close();
	}
}


//open the facebook
//click create new account 
//fill all the details 
//close the browser
//condition :- handle the dropdown menu by select class


//write a script for demoapps.Qspider.com
//open the browser maxmise 
//enter into home page 
//click ui testing concept

//automate the option which is present in the xpath section 
//login 1 ,2 ,3




