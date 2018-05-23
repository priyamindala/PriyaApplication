package com.NewToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
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
			
		driver.close();
		

	}

}
