package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStartupScript2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh4kCOjonRCLlhtJUm4OTyrAK&gclid=Cj0KCQjwovPGBhDxARIsAFhgkwSe8mzj_LR2bc5iSMsyDGsPCtpRsgOX5A28dER7F906S5g1jY98he0aAt75EALw_wcB");
		Thread.sleep(3000);
		
		driver.close();
	}
}
