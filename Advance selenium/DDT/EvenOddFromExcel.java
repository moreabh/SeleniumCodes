package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EvenOddFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\SeleniumexcelFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("EvenOddNo");
		 
		 int row = sh.getPhysicalNumberOfRows();
		 int column = sh.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("Row: "+row);
		 System.out.println("Column: "+column);;
		 
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < column; j++) {
				 
				 double num =  sh.getRow(i).getCell(j).getNumericCellValue();
				 
				 if (num%2==0) {
					
					 System.out.println(num+" is Even");
					 
				} else {
					System.out.println(num+" is Odd");

				}
				 
			//prime
				 int den = 2;
				 
				 if(num<den) {
					 System.out.println("num is less than 2");
				 }
				 while(den<num){
					
					 if(num%den ==0)
					 {
						 break;
					 }
					 den++;
				}
				 if(den==num)
				 {    
					 System.out.println(num+" No is prime");
				 }
			}
		 }
	}
}
