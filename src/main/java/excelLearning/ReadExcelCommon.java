package excelLearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class ReadExcelCommon {

	public Object[][] readExcel(String Filename) throws IOException{
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+Filename+".xlsx");
		XSSFSheet sheetName = wBook.getSheetAt(0);
		int rowCount = sheetName.getLastRowNum();
		//int RowCout = sheetName.getPhysicalNumberOfRows();
		//System.out.println(RowCout);
		short cellCount = sheetName.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheetName.getRow(i);
			for (int j = 0; j < cellCount; j++ ) {
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j] = "";
				}
				//System.out.println(data);
			}
		}
		wBook.close();
		return data;
	}
}
