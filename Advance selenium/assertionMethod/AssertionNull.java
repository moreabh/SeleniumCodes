package assertionMethod;

import static org.testng.Assert.assertNull;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionNull {

	@Test
	public void main() {

		ChromeDriver driver = null;
		assertNull(driver, "driver contains data");
		Reporter.log("driver contains null", true);
		
	}
}
