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

public class Data_ProviderFromExcel {
	@DataProvider(name="user")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataSheet.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("DataSheet");
		 
		 int rows = sh.getPhysicalNumberOfRows();
		 int columns = sh.getRow(0).getPhysicalNumberOfCells();
		 
		 Object[][] obj = new Object[5][1];
		 
		 int j=0;
		 
		 for (int i = 0; i < rows; i++) {
			 obj[i][j] = sh.getRow(i).getCell(j).toString();	
		}
		return obj;
		
	}
	
	@Test (dataProvider = "user")
	public void receiver(String username) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		
	driver.close();

	}

}
