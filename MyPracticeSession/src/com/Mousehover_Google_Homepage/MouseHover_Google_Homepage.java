package com.Mousehover_Google_Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseHover_Google_Homepage {

	public static void main(String[] args) 
	{
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("http://google.com");
	   
	   WebElement SignIN = driver.findElement(By.id("gb_70"))

       Actions act = new Actions.driver;
	   
	}

}
