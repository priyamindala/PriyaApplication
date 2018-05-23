package com.WebBrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElementByLinkText("REGISTER").click();
		
		
	}

}
