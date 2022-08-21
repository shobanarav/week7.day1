Feature: Login to the Leaftaps Application

Background:
Given Launch the chrome browser
And Load the URL and maximize

Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is loaded

Scenario: Negative Login
Given Type the username as 'Demisale'
And Type the password as 'crmsfa1'
When Click on the Login button
But Error message is displayed