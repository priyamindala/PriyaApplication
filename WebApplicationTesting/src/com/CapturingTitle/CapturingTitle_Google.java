package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Google {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		//driver.navigate().to("http://facebook.com");

		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.close();
		
	}

}
