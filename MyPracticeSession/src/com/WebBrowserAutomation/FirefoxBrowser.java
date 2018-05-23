package com.WebBrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
	//driver.get("http://google.com");
	driver.navigate().to("http://gmail.com");
	String Title = driver.getTitle();
	
	System.out.println(Title);
	
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	//driver.navigate().back();
	
	
	driver.close();
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("http://facebook.com");
		String URL1 = driver1.getCurrentUrl();
		
		System.out.println(URL1);
		
		String Title1 = driver1.getTitle();
		System.out.println(Title1);
		driver1.close();
		

	}

}
