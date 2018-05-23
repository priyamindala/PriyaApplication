package com.Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames_WriteToExcel {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");

		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		Register.click();
		
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement>CountryNames = country.findElements(By.tagName("option"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
	    XSSFWorkbook workBook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int k=0;k<CountryNames.size();k++)
		{
			String CountryName=CountryNames.get(k).getText();
			
			System.out.println(CountryName);
		
			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			
			c.setCellValue(CountryName);
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
			workBook.write(file1);
				
		}
		
		
	    
	    driver.close();
	
	}

	}


