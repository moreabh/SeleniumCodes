package assertionMethod;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionNotNull {

	@Test
	public void main() {
		ChromeDriver driver = new ChromeDriver();
		assertNotNull(driver, "driver is null");
		Reporter.log("driver contains data", true);
	}
}
 