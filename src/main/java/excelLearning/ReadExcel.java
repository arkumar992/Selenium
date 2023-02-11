package excelLearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class ReadExcel {

	public void readExcel() throws IOException{
		XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx");
		XSSFSheet sheetName = wBook.getSheet("login");
		int rowCount = sheetName.getLastRowNum();
		//int RowCout = sheetName.getPhysicalNumberOfRows();
		//System.out.println(RowCout);
		short cellCount = sheetName.getRow(0).getLastCellNum();
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheetName.getRow(i);
			for (int j = 0; j < cellCount; j++ ) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
	}
}
