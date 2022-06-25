package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_10_Framework\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		 wb=new XSSFWorkbook(file);
		
	}
	
	public String getStrinData(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
	}
	
	
