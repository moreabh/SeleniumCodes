package landingPage;

import org.testng.annotations.Test;

public class DependanciesMethod {

	@Test (priority = 2) 
	public void createAccount()
	{
		System.out.println("Account is created");
	}
	
	@Test (priority = 1, dependsOnMethods = "createAccount")
	public void updateAccount()
	{
		System.out.println("Account is updated");
	}
	
	@Test (priority = 0, dependsOnMethods = {"createAccount","updateAccount"})
	public void deleteAccount()
	{
		System.out.println("Account Deleted");
	}
	
}
