package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlockTesting {

	public static void main(String[] args) 
	{
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://www.tsrtconline.in/oprs-web/");
	  
	  
	  // class="menu-wrap"
	  WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	  
	 List<WebElement>headerBlockLinks =headerBlock.findElements(By.tagName("a"));
	 
	 System.out.println(headerBlockLinks.size());
	 
	 for(int k=0;k<headerBlockLinks.size();k++)
	 {
		 String headerLinkName=headerBlockLinks.get(k).getText();
		 System.out.println(k+" "+headerLinkName);
		 
		 
		 headerBlockLinks.get(k).click();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();
		 
		 driver.navigate().back();
		 
		 Sleeper.sleepTightInSeconds(5);
		 
		 // identify the block 
		 headerBlock=driver.findElement(By.className("menu-wrap"));
		 // Re creating arry list
		 headerBlockLinks =headerBlock.findElements(By.tagName("a"));
		 
	 }
	 
	  driver.close();
	  
	  

	}

}
