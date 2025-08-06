package utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSheet {

	public String readData(int row, int column) throws IOException {
		File src = new File(System.getProperty("user.dir") + "\\ExcelSheet\\Book1.xlsx");
//		To load that particular location

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");


	    DataFormatter formatter = new DataFormatter();
	    String value = formatter.formatCellValue(sh1.getRow(row).getCell(column));

	    wb.close();  // Always close workbook to avoid memory leak
	    fis.close();

	    System.out.println(value);
	    return value;
	}

	public static void main(String[] args) throws IOException {

		File src = new File(System.getProperty("user.dir") + "\\ExcelSheet\\Book1.xlsx");

// to load the particular file from excel sheet

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

		String value = sh1.getRow(5).getCell(1).getStringCellValue();
		System.out.println(value);

		String value1 = sh1.getRow(14).getCell(0).getStringCellValue();
		System.out.println(value1);

//To get the last used row index value
		int lastrownumber = sh1.getLastRowNum();
		System.out.println("Last row number is :" + lastrownumber);

//To get the last column number	
		int lastcolumnnumber = sh1.getRow(1).getLastCellNum();
		System.out.println("Last column number is :" + lastcolumnnumber);

		ExcelSheet er = new ExcelSheet();

		String intvalue = er.readData(10, 0);

		System.out.println(intvalue);

		String intvalue2 = er.readData(10, 1);

		System.out.println(intvalue2);

	}

}
