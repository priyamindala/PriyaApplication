package com.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_HomePageTesting 
{
	
	FirefoxDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void HomePage()
	{
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.SignOn();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Register();
		String expected_regTitle="Register: Mercury Tours";
		String actual_regTitle=driver.getTitle();
		
		Assert.assertEquals(actual_regTitle, expected_regTitle);
		
		System.out.println(driver.getTitle());
		Reporter.log("Successfully Naviageted to Register WebPage");
		driver.navigate().back();
		
		
		
		WMT.FindAFlight("tutorial", "tutorial");
		
		String expected_Title="Find";
		String actual_Title=driver.getTitle();
		
		/*if(actual_Title.contains(expected_Title))
		{
			System.out.println("Title matched -- LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- logIn Failed -- FAIL");
		}**/
		
		Assert.assertTrue(actual_Title.contains(expected_Title), "Title Not Matched -- Fail");
		
		Reporter.log("LogIn Successful -- PASS");
		
		System.out.println(driver.getTitle());
		System.out.println(expected_Title);
		driver.navigate().back();
		
		
		WMT.Support();
		
		String expected_supTitle="Under Construction: Mercury Tours";
		String actual_supTitle=driver.getTitle();
		
        Assert.assertTrue(actual_supTitle.contains(expected_supTitle), "Title Not Matched -- Fail");
		Reporter.log("Succuessfully Navigated to Support Page -- PASS");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		
		
		WMT.Contact();
		String expected_conTitle="Under Construction: Mercury Tours";
		String actual_conTitle=driver.getTitle();
		
        Assert.assertTrue(actual_conTitle.contains(expected_conTitle), "Title Not Matched -- Fail");
		Reporter.log("Succuessfully Navigated to Contact Page -- PASS");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.close();
		
	}
	
}
