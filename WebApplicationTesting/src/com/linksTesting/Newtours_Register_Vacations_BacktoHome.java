package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_Register_Vacations_BacktoHome {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//<a href="mercuryregister.php">REGISTER</a>
		driver.findElementByLinkText("REGISTER").click();
		
		//<a href="mercuryunderconst.php">Vacations</a>
		driver.findElementByLinkText("Vacations").click();
		
		// html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		driver.close();
		
	}

}
