package com.crm.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.BaseClass.BaseClass;  
import com.crm.utility.ScreenshotUtility;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	    System.out.println("Test failed: " + result.getName());

    	    Object testClass = result.getInstance();

    	    if (testClass instanceof BaseClass) {
    	        WebDriver driver = ((BaseClass) testClass).getDriver();
    	        ScreenshotUtility.takeScreenshot(driver, result.getName());
    	    } else {
    	        System.out.println("Could not get driver from test instance");
    	    }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished");
    }
}
