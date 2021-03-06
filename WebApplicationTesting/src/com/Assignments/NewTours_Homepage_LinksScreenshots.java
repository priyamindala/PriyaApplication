package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Homepage_LinksScreenshots {

	public static void main(String[] args) throws IOException 
	
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int k=0;k<links.size();k++)
		{
			String linkName=links.get(k).getText();
			System.out.println(k+"  "+linkName);
			
			
			links.get(k).click();
			
			File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Destination= new File("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\ScreenShots\\" +linkName+ ".png" );
			FileUtils.copyFile(Source, Destination);
			
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
			


		}
		
		driver.close();
		
	    
		
	}
	

}
