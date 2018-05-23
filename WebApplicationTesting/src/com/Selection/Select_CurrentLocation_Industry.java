package com.Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_CurrentLocation_Industry {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		driver.manage().window().maximize();
		
		// class="border_grey1"
		
		WebElement CurrentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(CurrentLocation);
		//selection.selectByIndex(3);
		//selection.selectByValue("2");
		selection.selectByVisibleText("Delhi");
		
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sel = new Select(industry);
		sel.selectByIndex(3);
		sel.selectByValue("4");
		sel.selectByVisibleText("Any");
		
		
		
		
		

	}

}
