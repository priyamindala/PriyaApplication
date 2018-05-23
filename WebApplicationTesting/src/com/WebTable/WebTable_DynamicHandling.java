package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_DynamicHandling {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");

		
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement>Rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<Rows.size();i++)
		{
			List<WebElement>Columns=Rows.get(i).findElements(By.tagName("td"));
			
			for(int k=0;k<Columns.size();k++)
			{
				String data=Columns.get(k).getText();
				System.out.print(data+"  ");
			}
			
			System.out.println();
		}

		driver.close();
	}

}
