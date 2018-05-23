package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1
{
	
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("FireFox Browser Launch");
		
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("Testing LogIn Functionality ");
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
	System.out.println("testing Compose Mail Funcationality");
	
	}
	@Test(priority=4)
	public void InBox()
	{
		System.out.println("Testing InBox Funcationality");
	}
	
	
}
