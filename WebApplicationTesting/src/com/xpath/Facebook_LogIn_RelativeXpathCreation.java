package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogIn_RelativeXpathCreation {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("Hello");
		// data-testid="royal_email"
		
		//htmlTag(@Attribute='value')
		// id="email"
		
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hiiii");
		
		// class="inputtext"  and data-testid="royal_pass"
		
		driver.findElement(By.xpath("//input[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("Hello");
		
		

	}

}
