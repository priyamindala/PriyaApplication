Feature: NewTours Application LogIn Functionality Testing

Scenario Outline: Validate the logIn functionality

Given Open Firefox Browser and Navigate to NewTours Application
When User enters Valid "<UserName>" and "<Password>" and click on SignIn button
Then User should be able to successfully LogIn and close the Application

Examples:
 |    UserName    |    Password   |
 |    tutorial    |    tutorial   |
 |    admin       |    mercury    |
 |    tutorial    |    tutorial   |