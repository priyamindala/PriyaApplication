package com.HandlingAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Alert {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(10000);
		
		alt.accept();
		
		
		//alt.dismiss();
		
		//alt.sendKeys("hello");
		
		//driver.quit();
	}

}
