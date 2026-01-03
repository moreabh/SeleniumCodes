package functionalityTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.listeners.BaseClass;
import com.crm.pom.Login;

public class LoginPage extends BaseClass {
	
	Login log = new Login(driver);
	@Test(priority = 0)
	public void tc_01() {
		String actual_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String expected_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		log.username("Admin");
		log.password("admin123");
		log.login_button();
	
		if (actual_URL.equals(expected_URL)) {
			Reporter.log("Login Unsuccessfull",true);
			
		} else {
			Reporter.log("Login successfull",true);
		}
	}

}
