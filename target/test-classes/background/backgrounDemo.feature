Feature: This is background demo

Background: User is logged into sauce demo app
Given: User is accessing saucedemo login page
When: User enters valid username and password
Then: User should be able to enter into the Home page


Scenario: Test menu Items
Given User access the saucedemo app login page
When User enters valid credentails
And Click on breadcrum icon
Then User should be able to see the menu Items


Scenario: Verify add to functionality 
Given User access the saucedemo app login page
When User enters valid credentails
And Clicks on Add to button
Then Item should be added to the cart


