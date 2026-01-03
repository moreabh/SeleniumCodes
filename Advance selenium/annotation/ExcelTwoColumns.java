package annotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTwoColumns {
	
	@DataProvider(name="dwsLogin")
	public Object[][] dwsLogin() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("DwsLogin");
		int rows = sh.getPhysicalNumberOfRows();
		int colom = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[3][2];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colom; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).toString();
			}	
		}
		return obj;	
	}

	
	@Test(dataProvider = "dwsLogin")
	public void main(String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
