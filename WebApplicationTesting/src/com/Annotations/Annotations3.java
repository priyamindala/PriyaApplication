package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 
{
	
	
	@BeforeMethod
	public void NavigateToApplicationAndLogIn()
	{
		System.out.println("Firefox Browser Launch and LogIn");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
	System.out.println("testing Compose Mail Functionality");
	
	}
	@Test(priority=1)
	public void InBox()
	{
		
		System.out.println("Testing InBox Funcationality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Closing the Appliation");
	}
	
}
