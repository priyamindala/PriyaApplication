package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButtonTesting
{

	
	public static void main(String []args) throws InterruptedException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>radio=block.findElements(By.name("group1"));
		
		System.out.println(radio.size());
		
		for(int k=0;k<radio.size();k++) /// used to perform click on each and every radio Button
		{
			radio.get(k).click();
			
			Thread.sleep(10000);
			
			for(int p=0;p<radio.size();p++) // to find the status of the Radio Buttons
			{
				System.out.println(radio.get(p).getAttribute("value")+"   "+radio.get(p).getAttribute("checked"));
			}
			
		}
		
		driver.close();
		
	}
	
	
}
