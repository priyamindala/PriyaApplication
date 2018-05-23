package com.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Register_ValidateRegistration 
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
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
			
	}
	
	@Test(priority=2)
	public void NewUserRegistration()
	{
		//name="firstName"
		driver.findElement(By.name("firstName")).sendKeys("Priya");
		driver.findElement(By.name("lastName")).sendKeys("MH");
		driver.findElement(By.name("phone")).sendKeys("9999911111");
		
		//id="userName" --Email
		driver.findElement(By.id("userName")).sendKeys("priyamh@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("#123, MMLayout");
		driver.findElement(By.name("address2")).sendKeys("KBSandra");
		driver.findElement(By.name("city")).sendKeys("Bengaluru");
		
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		driver.findElement(By.name("postalCode")).sendKeys("500061");
		
		WebElement CountryName=driver.findElement(By.name("country"));
		//<option value="92">INDIA </option>
		Select Selection=new Select(CountryName);
		Selection.selectByVisibleText("INDIA");
		
		// id="email" --- User information - Username
		driver.findElement(By.name("email")).sendKeys("priyamh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		// Xpath for Submit Button - html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
		
		String actual_RegisteredUsername=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		String expected_UserName="priyamh@gmail.com";
		
		if(actual_RegisteredUsername.contains(expected_UserName))
		{
			System.out.println("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
