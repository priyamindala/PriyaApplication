package com.linksTesting;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");

		/* 
 <a href="mercuryregister.php?osCsid=b494c841222f303127ec56db9a37cbdb">REGISTER</a>

 a - anchor Tag --- creating a link 
 href - attribute -- a reference URL

 locator should be used as "linkText"
 text given for link is our selector -- REGISTER */
		
		driver.findElementByLinkText("REGISTER").click();
		
		driver.close();
 
	}

}
