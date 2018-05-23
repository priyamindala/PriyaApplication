package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		Register.click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		for(int i=0;i<CountryNames.size();i++)
		{
			String CountryName=CountryNames.get(i).getText();
			System.out.println(i+" "+CountryName);
		}
		
		driver.close();
	}

}
