package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingForLoopExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\SeleniumexcelFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Login");
		 
		 int row = sh.getPhysicalNumberOfRows();
		 int column = sh.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("Row: "+row);
		 System.out.println("Column: "+column);;
		 
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < column; j++) {
				 String data = sh.getRow(i).getCell(j).toString();
				 System.out.println(data);
			}
			
		}
	}
}
