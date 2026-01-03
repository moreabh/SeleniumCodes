package com.crm.listeners;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.Simple.class)


public class SimpleTestCase extends BaseClass {
	@Test(priority = 0)	
	public void main1() {
		assertEquals("java", "java", "It is not same");
		Reporter.log("main1 it is same",true);
		
	}
	@Test(priority = 1)
	public void main2() {
		assertEquals("selenium", "java", "It is same");
		Reporter.log(" main2 it is not same",true);	
	}
	
	@Test(priority = 2, dependsOnMethods = "main2")
	public void main3() {
		assertEquals("joli", "khali","It is same");
		Reporter.log("main3 it is not same",true);
	}
	

}
