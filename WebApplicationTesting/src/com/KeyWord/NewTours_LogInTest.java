package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
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
	
	
	@Test
	public void LogIn() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\NewTours.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
		String expected_Title ="Find";
		String actual_Title = driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
