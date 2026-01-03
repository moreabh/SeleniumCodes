package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReverseNumberExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\SeleniumexcelFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sh = wb.getSheet("Reverse");
		
		int row = sh.getPhysicalNumberOfRows();
		int column = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Row: "+row);
		System.out.println("Column: "+column);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				double d = sh.getRow(i).getCell(j).getNumericCellValue();
				int num = (int) d;
				
				int rev = 0;
				
				while(num != 0)
				{
					int digit = num%10;
					rev = rev*10 + digit;
					num = num/10;
				}
				System.out.println(d+" Reverse Is: "+rev);
			}
			
		}
		
	}

	
}
