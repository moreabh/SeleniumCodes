package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	    protected WebDriver driver;
	    public  WebDriverWait wait;
	    @BeforeMethod
	    public void preCondition() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
//	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    @AfterMethod(alwaysRun = true)
	    public void postCondition() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
}
