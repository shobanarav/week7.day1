Feature: Login to the Leaftaps Application and Edit Lead

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button

Scenario Outline: Edit existing lead data 
Given Click CRMSFA Link
And Click Leads Tab
And Click Find Leads Link
When Type the first name as <firstName>
And Click Find Leads Button
And Select first Lead ID
And Click on Edit Button
When Edit the company name as <companyName>
And Click on Update Button
Then Verify if the change is made

Examples:
|firstName|companyName|
|Karthik|Wipro|
|Shobana|TestLeaf|