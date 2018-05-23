package com.Log4JJ;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest 
{
	public static Logger logger = Logger.getLogger("NewTours_LogInTest");
	
	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("Log4j.properties");
		
		FirefoxDriver driver = new FirefoxDriver();
		logger.info("Firefox Browser opened Successfully");
		
		driver.get("http://newtours.demoaut.com");
		logger.info("Successfully navigated to NewTours Application");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		logger.info("Entered valid Email Id");
		
		// name="password"
		driver.findElement(By.name("password")).sendKeys("tutorial");
		logger.info("Entered Valid Password");
		
		// name="login"
		driver.findElement(By.name("login")).click();
		logger.info("Clicked on signIn button");
		
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
		
		logger.info("LogIn is Successfully");
		
		driver.close();
		logger.info("NewTOurs Application Closed Successfully");
		
		
	}

}