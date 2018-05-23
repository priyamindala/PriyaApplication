package com.NewToursLogInTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest
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
	public void LogIn()
	{
		//name="userName"
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// name="password"
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// name="login"
		driver.findElement(By.name("login")).click();
		
		String expected_Title ="Find";
		String actual_Title=driver.getTitle();
		
		System.out.println(expected_Title+"   Expected Title");
		System.out.println(actual_Title+"    Actual Title");
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successful -- PASS");
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
