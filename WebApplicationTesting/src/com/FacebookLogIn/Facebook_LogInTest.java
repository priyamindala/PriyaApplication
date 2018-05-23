package com.FacebookLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// locator="selector"
		// id="email" 
		driver.findElement(By.id("email")).sendKeys("priya");
		
		// id="pass"
		
		driver.findElementById("pass").sendKeys("Hello");
		
		//  id="loginbutton" 
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();

	}

}
