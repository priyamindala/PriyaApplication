package com.WebBrowserAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Homepage_LinksNumber {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
             
		System.out.println(Links.size());
		
		driver.close();
	}

}
