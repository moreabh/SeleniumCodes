package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemoveDuplicateExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\SeleniumexcelFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Duplicate");
		
		int row = sh.getPhysicalNumberOfRows();
		int columns = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Row: "+row);
		System.out.println("Columns: "+columns);
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < columns; j++){
				double d = sh.getRow(i).getCell(j).getNumericCellValue();	
				int num = (int) d;	
			}
		}
		
	}
}
