package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		String expected_Title="Google";
		String actual_Title=driver.getTitle();
		
		System.out.println(expected_Title+"   Expected Title");
		System.out.println(actual_Title+"    Actual Title");
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title not Matched -- FAIL");
		}
		
		driver.close();

	}

}
