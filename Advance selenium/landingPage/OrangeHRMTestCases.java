package landingPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.listeners.BaseClass;

public class OrangeHRMTestCases extends BaseClass{

	@Test
	public void tc_01() throws Exception {

	    WebElement assign_leave = driver.findElement(By.xpath("//button[@title=\"Assign Leave\"]"));
	    if (assign_leave.isDisplayed()) {
	    	System.out.println("Assign leave is displaying");
		}
	    else {
			driver.close();
			throw new Exception("Test case fail, Assign leave is not displaying");
		} 
	}
	@Test
	public void tc_02() throws Exception {
	
		String username = "Admin";
	    WebElement searchField = driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
	    searchField.sendKeys("Admin");
	    Thread.sleep(3000);
	    
	    WebElement admin = driver.findElement(By.xpath("//span[text()=\"Admin\"]"));
	    Thread.sleep(3000);
	    String admin_Attribute = searchField.getAttribute("value");
	    
	    if (admin_Attribute.equals(username)) {			
		Thread.sleep(2000);
	    	driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
		}
	    else {
			driver.close();
			throw new Exception("Test case Fail, Admin is not Displaying");
		}  
	}
	@Test 
		public void tc_03() throws Exception{
		    WebElement apply_leave = driver.findElement(By.xpath("//div[@title=\"Apply Leave\"]"));
		    
		    if(apply_leave.isEnabled()) {
		    	
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//div[@title=\"Apply Leave\"]")).click();
		    }
		    else {
		    	driver.close();
		    	throw new Exception("Apply leave is not enabled, Test Case fail!");
		    }
	}
}

	