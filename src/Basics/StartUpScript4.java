package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_1cfjttkdmt_e&adgrpid=155259812393&hvpone=&hvptwo=&hvadid=774088017535&hvpos=&hvnetw=g&hvrand=2047277436120190814&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062095&hvtargid=kwd-28878962&hydadcr=14456_2429119&gad_source=1");
		
		driver.close();
	}
}
