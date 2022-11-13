package com.maven_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven_Write {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Maven_ProjectClass\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
		Sheet createSheet1 = w.createSheet("Data3");
		
		Row createRow1 = createSheet1.createRow(0);
		
//		Cell cell1 = createRow1.createCell(0);
		
//		cell1.setCellValue("Thiru");
//		
//		w.getSheet("Data").getRow(0).createCell(1).setCellValue("Sowpriya");
		
		createRow1.createCell(0).setCellValue("Thiru");
		
		createRow1.createCell(1).setCellValue("Sowpriya");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
	}
	
		
}
