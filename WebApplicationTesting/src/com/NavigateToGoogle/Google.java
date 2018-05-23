package com.NavigateToGoogle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) 
	{
		FirefoxDriver priya = new FirefoxDriver();
		
		FirefoxDriver hello = new FirefoxDriver();
		priya.get("http://www.google.co.in");
		
		hello.navigate().to("http://facebook.com");
		
		priya.close();
		hello.close();

	}

}
