package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Signin_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		//id="gb_70"
		//driver.findElementById("gb_70").click();
		
		driver.findElement(By.linkText("Sign in")).click();
		
	

	}

}
