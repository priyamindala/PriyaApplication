package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageUpload {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// id="create-dropdown-button"
		driver.findElement(By.id("create-dropdown-button")).click();
		
		// class="upload-subitem"
		driver.findElement(By.className("upload-subitem")).click();
		
		// .//*[@id='upload-modal']/div[2]/div[2]/label
		driver.findElement(By.xpath(".//*[@id='upload-modal']/div[2]/div[2]/label")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\priya\\OneDrive\\Desktop\\PriyaSelenium\\WebApplicationTesting\\AutoItScripts\\fileUpload.exe");
		
				

	}

}
