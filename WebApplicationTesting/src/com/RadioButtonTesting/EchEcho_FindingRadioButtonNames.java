package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchEcho_FindingRadioButtonNames {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>radio=block.findElements(By.name("group1"));
		
		System.out.println(radio.size());
		
		for(int k=0;k<radio.size();k++)
		{
			
			String RadioButtonName=radio.get(k).getAttribute("value");
			System.out.println(RadioButtonName);
		}
		
		driver.close();
		

	}

}
