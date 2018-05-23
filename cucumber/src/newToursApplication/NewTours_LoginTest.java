package newToursApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTours_LoginTest 
{
	FirefoxDriver driver;
	
	@Given("^Open Firefox Browser and Navigate to NewTours Application$")
	public void Open_Firefox_Browser_and_Navigate_to_NewTours_Application() 
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/*@When("^User enters Valid UserName and Password and click on SignIn button$")
	public void User_enters_Valid_UserName_and_Password_and_click_on_SignIn_button() 
	{
		//name="userName"
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// name="password"
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// name="login"
		driver.findElement(By.name("login")).click();

	
	}*/
	
	@When("^User enters Valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_Valid_and_and_click_on_SignIn_button(String UserName, String Password) 
	 {
		//name="userName"
				driver.findElement(By.name("userName")).sendKeys(UserName);
				
				// name="password"
				driver.findElement(By.name("password")).sendKeys(Password);
				
				// name="login"
				driver.findElement(By.name("login")).click();
		
	   }

	@Then("^User should be able to successfully LogIn and close the Application$")
	public void User_should_be_able_to_successfully_LogIn_and_close_the_Application() 
	{
		String expected_Title ="Find";
		String actual_Title=driver.getTitle();
		
		System.out.println(expected_Title+"   Expected Title");
		System.out.println(actual_Title+"    Actual Title");
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successful -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
		
		driver.close();
	}
}
