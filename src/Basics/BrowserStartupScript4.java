package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStartupScript4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=5860482375620615698&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062097&hvtargid=kwd-64107830&hydadcr=14452_2429115&gad_source=1");
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
