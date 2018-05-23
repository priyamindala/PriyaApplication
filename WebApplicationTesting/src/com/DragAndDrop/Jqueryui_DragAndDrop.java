package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jqueryui_DragAndDrop 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void DragandDrop()
	{
		// identifying a particular frame of a webPage to recognize the elements in it to be automated
		
	/*WebElement frm=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frm);*/
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Destination).build().perform();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
