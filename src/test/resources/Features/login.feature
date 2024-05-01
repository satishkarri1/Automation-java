Feature: Login page Automation of sauce demo App
Scenario Outline: check login is successful with valid credentails
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on login Button
Then User is navigated to Home page
And Close the browser


Examples:
| username | password|
| standard_user| secret_sauce|
