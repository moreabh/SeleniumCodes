package assertionMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class HardAssertionMethod {
	@Test
	public void main() {
		String expected_data = "Mani";
		String actual_data = "Mani";
		int a = 10;
		int b = 10;
		assertEquals(expected_data, actual_data,"Testcase fail");
		assertNotEquals(a, b,"TestCase Fail");
		System.out.println("TestCase pass");
		System.out.println("next step");
		System.out.println("click");
		System.out.println("close");
	}
	
}
