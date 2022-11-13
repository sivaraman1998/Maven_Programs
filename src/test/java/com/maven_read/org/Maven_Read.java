package com.maven_read.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven_Read {

	public static void read_AllData() throws IOException {

		File f = new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Maven_ProjectClass\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		@SuppressWarnings("resource")
		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);
	
		int rows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Number of rows(presented data) = " + rows);

		// outer loop		//6    2
		for (int i = 0; i < rows; i++) {
			Row row1 = sheetAt.getRow(i);// 0th row
			int cells = row1.getPhysicalNumberOfCells();// 0th row,all cells
			// inner loop/2 i=0	 3
			for (int j = 0; j < cells; j++) { // 0th row, 0th cell
				Cell cell1 = row1.getCell(j);// 0th row,0th column
				CellType cellType1 = cell1.getCellType();

				if (cellType1.equals(CellType.STRING)) {
					String value = cell1.getStringCellValue();
					System.out.println(value);
				} else if (cellType1.equals(CellType.NUMERIC)) {
					int value1 = (int) cell1.getNumericCellValue();
					System.out.println(value1);
				}
			}
		}
	}

	public static void particular_Data() throws IOException {
		File f= new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Maven_ProjectClass\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt1 = w.getSheetAt(0);
											//6
		@SuppressWarnings("unused")
		int numberOfRows = sheetAt1.getPhysicalNumberOfRows();
		
		Row row1 = sheetAt1.getRow(2);
		Cell cell1 = row1.getCell(2);

		System.out.println(cell1);
	}

	public static void main(String[] args) throws IOException {

		System.out.println("****All Data****");
		read_AllData();
		System.out.println("***Particular Data****");
		particular_Data();

	}

}
