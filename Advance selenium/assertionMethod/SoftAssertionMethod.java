package assertionMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionMethod {

	@Test
	public void main() {
		String program = "Java";
		String fire = "lava";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(program,fire,"Failure is happend due to comparison is not same");
		System.out.println("Going to the next step");
		soft.assertAll();
		
	}
}
