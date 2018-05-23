package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
                         // Object Repository Class
	
	// identifying the Elements in the Application web page and creating methods to Automate the Elements
	
	//WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	
	// @FindBy - Annotation -- from WebFactoryy Class
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn() // Business Logic -- name is given as the functionality it is automation
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(name="userName")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement logIn;
	
	public void FindAFlight(String UName,String Pwd)
	{
		Username.sendKeys(UName);
		Password.sendKeys(Pwd);
		logIn.click();
		
	}
	
	@FindBy(linkText = "SUPPORT")
	WebElement Support;
	
	public void Support()
	{
		Support.click();
	}
	
	@FindBy(linkText = "CONTACT")
	WebElement Contact;
	
	public void Contact()
	{
		Contact.click();
	}
	
	
}
