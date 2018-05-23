package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData_MultipleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int i=0;i<=RowCount;i++) // Rows
		{
			Row r=sheet.getRow(i);
			
			int CellCount=r.getLastCellNum();
			for(int j=0;j<CellCount;j++) // goto Every Row of a Cell and get the data
			{
				String data=r.getCell(j).getStringCellValue();
				System.out.print(data+"  ");
				
			}
			System.out.println();
			
		}
		
	}

}
