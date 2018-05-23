package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.close();

	}

}
