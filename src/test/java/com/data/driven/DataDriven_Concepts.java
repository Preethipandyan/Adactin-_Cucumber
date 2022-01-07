package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Concepts {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\Credential.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f);
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			
		int cellsize = row.getPhysicalNumberOfCells();	
		for (int j = 0; j < cellsize; j++) {
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			} else if (cellType.equals(CellType.NUMERIC)) {
				double d = cell.getNumericCellValue();
				long value = (long) d;
				//String valueOf = String.valueOf(value);
				System.out.println(value);
				
			}
		}
		
	}
}

}
