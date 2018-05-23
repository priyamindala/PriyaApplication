package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUserRegistration_MultipleTestData
{
	
	
	FirefoxDriver driver;
	@BeforeTest
    public void setUp()
    {
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
			

}

	
	@Test(priority=2)
	public void NewUserRegistration() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\Newtours_Registration_MultipleTestData.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int k=1;k<=RowCount;k++)
		{
		
		Row r=sheet.getRow(k);
		
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		
		//id="userName" --Email
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("address2")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(6).getStringCellValue());
		
		driver.findElement(By.name("state")).sendKeys(r.getCell(7).getStringCellValue());
		
		
		double y=r.getCell(8).getNumericCellValue();
		long p=(long)y;
		String postalCode=Long.toString(p);
		
		
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		WebElement CountryName=driver.findElement(By.name("country"));
		//<option value="92">INDIA </option>
		//Select Selection=new Select(CountryName);
		//Selection.selectByVisibleText("INDIA");
		CountryName.sendKeys(r.getCell(9).getStringCellValue());
		
		// id="email" --- User information - Username
		driver.findElement(By.name("email")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(12).getStringCellValue());
		
		// Xpath for Submit Button - html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
		
		String actual_RegisteredUsername=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		String expected_UserName=r.getCell(10).getStringCellValue();
		
		if(actual_RegisteredUsername.contains(expected_UserName))
		{
			System.out.println("User Registered Successfully -- PASS");
			r.createCell(13).setCellValue("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
			r.createCell(13).setCellValue("User Registration Failed -- FAIL");
		}

		FileOutputStream file1 = new FileOutputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestResultFiles\\NewUserRegistrationMultipeTestDataResult.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
		
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}

}
