package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 
{
	@BeforeTest
	public void NavigateToApplicationAndLogIn()
	{
		System.out.println("Firefox Browser Lanch and LogIn");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
	System.out.println("testing Compose Mail Funcationality");
	
	}
	@Test(priority=1)
	public void InBox()
	{
		
		System.out.println("Testing InBox Funcationality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Closing the Appliation");
	}

}
