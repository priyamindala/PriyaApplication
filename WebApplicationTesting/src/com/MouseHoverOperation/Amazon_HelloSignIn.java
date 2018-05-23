package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		// id="nav-link-yourAccount"
		WebElement HelloSignIN=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		act.moveToElement(HelloSignIN).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav_prefetch_yourorders']/span")).click();

	}

}
