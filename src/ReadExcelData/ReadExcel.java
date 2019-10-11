package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main(String[] args) throws IOException {
		System.out.println();
		File src = new File("./ExcelSheets/"+"ExcelSheet"+".xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		try {
			XSSFSheet s1 = wb.getSheet("Sheet1");

			Row row = s1.getRow(0);
			Cell cel = row.getCell(2);
			
			System.out.println(cel);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		wb.close();
	}
	}


